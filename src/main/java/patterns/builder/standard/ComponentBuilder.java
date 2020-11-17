package patterns.builder.standard;

import java.util.UUID;

public interface ComponentBuilder<T extends Component> {

    UUID getId();
    String getName();

    void setId(UUID id);
    void setName(String name);

    T build();
}
