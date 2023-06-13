package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensorList;
    private ArrayList<Integer> readings;

    public AverageSensor() {
        this.sensorList = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
       
    @Override
    public boolean isOn() {
        if(sensorList.isEmpty()) {
            return false;
        }
        
        for(Sensor sensor: sensorList){
            if(!sensor.isOn()){
                return false;
            }
        }
        
        return true;       
    }

    @Override
    public void setOn() {
        for(Sensor sensor: sensorList){
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for(Sensor sensor: sensorList){
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if(sensorList.isEmpty()){
            throw new IllegalStateException("The sensor list is empty!");
        }
        
        int sumValues = sensorList.stream()
                .map(sensor -> sensor.read())
                .reduce(0, (value, sum) -> value + sum);
        
        int avg = sumValues/sensorList.size();
        
        readings.add(avg);
        
        return avg;
    }
    
    public void addSensor(Sensor toAdd) {
        sensorList.add(toAdd);
    }
    
    public List<Integer> readings(){
        return readings;
    }
}
