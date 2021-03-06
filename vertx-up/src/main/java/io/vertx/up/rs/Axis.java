package io.vertx.up.rs;

import io.vertx.ext.web.Router;

/**
 * Axis to mount entity
 * 1. Router
 * 2. Route
 * 3. Event
 */
public interface Axis {
    /**
     * Router management entry
     *
     * @param router
     */
    void mount(Router router);
}
