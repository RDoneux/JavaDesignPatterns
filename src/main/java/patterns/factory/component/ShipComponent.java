package patterns.factory.component;

public interface ShipComponent extends Component {
    Integer getPointsValue();
    Integer getHealth();
    Boolean isConnected();
}
