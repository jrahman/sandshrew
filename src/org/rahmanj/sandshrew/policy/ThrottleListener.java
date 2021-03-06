package org.rahmanj.sandshrew.policy;

/**
 * Interfaces to listen for server throttle status change events
 *
 * @author Jason P. Rahman (jprahman93@gmail.com, rahmanj@purdue.edu)
 */
public interface ThrottleListener {

    /**
     * Invoked when the downstream is being throttled
     */
    public void onThrottle();

    /**
     * Invoked when the downstream is no longer throttled
     */
    public void onStopThrottle();
}
