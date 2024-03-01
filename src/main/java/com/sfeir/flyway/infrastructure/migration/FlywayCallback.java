package com.sfeir.flyway.infrastructure.migration;

import lombok.extern.slf4j.Slf4j;
import org.flywaydb.core.api.callback.BaseCallback;
import org.flywaydb.core.api.callback.Context;
import org.flywaydb.core.api.callback.Event;

@Slf4j
public class FlywayCallback extends BaseCallback {

    @Override
    public void handle(Event event, Context context) {
        if (event == Event.AFTER_EACH_MIGRATE) {
            log.info("Doing something after migration");
        }
    }

}
