package factory;

import factory.component.Battery;
import factory.component.ShipComponent;

public class ShipComponentClient {

    public ShipComponentClient(){

        Battery battery = ComponentBuilderFactory.battery()
                .health(30)
                .build();

    }

    public static void main (String args[]){
        new ShipComponentClient();
    }

}
