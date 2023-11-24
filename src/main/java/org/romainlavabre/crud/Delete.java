package org.romainlavabre.crud;


import org.romainlavabre.request.Request;

/**
 * @author Romain Lavabre <romainlavabre98@gmail.com>
 */
public interface Delete< E > {
    void delete( Request request, E entity );
}
