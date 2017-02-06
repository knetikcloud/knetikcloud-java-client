/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ArtistResource;
import io.swagger.client.model.PageResourceArtistResource;
import io.swagger.client.model.PageResourceTemplateResource;
import io.swagger.client.model.TemplateResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MediaArtistsApi
 */
@Ignore
public class MediaArtistsApiTest {

    private final MediaArtistsApi api = new MediaArtistsApi();

    
    /**
     * Adds a new artist in the system
     *
     * Adds a new artist in the system. Use specific media contributions endpoint to add contributions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addArtistTest() throws ApiException {
        ArtistResource artistResource = null;
        ArtistResource response = api.addArtist(artistResource);

        // TODO: test validations
    }
    
    /**
     * Create an artist template
     *
     * Artist Templates define a type of artist and the properties they have
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createArtistTemplateTest() throws ApiException {
        TemplateResource artistTemplateResource = null;
        TemplateResource response = api.createArtistTemplate(artistTemplateResource);

        // TODO: test validations
    }
    
    /**
     * Removes an artist from the system IF no resources are attached to it
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteArtistTest() throws ApiException {
        Long id = null;
        api.deleteArtist(id);

        // TODO: test validations
    }
    
    /**
     * Delete an artist template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteArtistTemplateTest() throws ApiException {
        String id = null;
        String cascade = null;
        api.deleteArtistTemplate(id, cascade);

        // TODO: test validations
    }
    
    /**
     * Loads a specific artist details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getArtistTest() throws ApiException {
        Long id = null;
        Integer showContributions = null;
        ArtistResource response = api.getArtist(id, showContributions);

        // TODO: test validations
    }
    
    /**
     * Get a single artist template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getArtistTemplateTest() throws ApiException {
        String id = null;
        TemplateResource response = api.getArtistTemplate(id);

        // TODO: test validations
    }
    
    /**
     * List and search artist templates
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getArtistTemplatesTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceTemplateResource response = api.getArtistTemplates(size, page, order);

        // TODO: test validations
    }
    
    /**
     * Search for artists
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getArtistsTest() throws ApiException {
        String filterArtistsByName = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceArtistResource response = api.getArtists(filterArtistsByName, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Modifies an artist details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateArtistTest() throws ApiException {
        Long id = null;
        ArtistResource artistResource = null;
        api.updateArtist(id, artistResource);

        // TODO: test validations
    }
    
    /**
     * Update an artist template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateArtistTemplateTest() throws ApiException {
        String id = null;
        TemplateResource artistTemplateResource = null;
        api.updateArtistTemplate(id, artistTemplateResource);

        // TODO: test validations
    }
    
}
