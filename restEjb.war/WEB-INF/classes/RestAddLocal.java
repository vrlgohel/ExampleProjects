package com.redhat.rest;

/**
 * Local interface that exposes the RestAddBean with REST endpoints
 */

public interface RestAddLocal {

    OneUpResponse addOne(int start);
}
