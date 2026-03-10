package dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("daoApi")
@Profile("api")
public class DaoApi implements IDao {

    @Override
    public double getValue() {
        return 0;
    }

    @Override
    public double getData() {
        return 220;
    }


    }