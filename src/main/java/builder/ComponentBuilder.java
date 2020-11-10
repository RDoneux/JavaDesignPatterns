package builder;

import java.util.UUID;

public interface ComponentBuilder<T extends Component, U extends ComponentBuilder<T,?>> {

    UUID getId();
    String getName();

    U id(UUID id);
    U name(String name);

    T build();
}
