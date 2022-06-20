package Lab9.prob12.singleton;

import java.util.Optional;

public class MySingletonLazy {
    private static MySingletonLazy instance = null;

    public static MySingletonLazy getInstance(){
        instance = Optional.ofNullable(instance).orElseGet(MySingletonLazy::new);
        return instance;
    }

    private MySingletonLazy(){

    }
}
