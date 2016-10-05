/* Generated by Together */

package architecture;

/**
 * @stereotype service 
 */
public class WebService {
    /**
     * @label communicate (XML) 
     */
    private Client lnkClient;

    /**
     * @label publish (XML)
     * @directed 
     */
    private UDDI lnkWebService;

    /**
     * @label Java Communication Protocol
     * @directed 
     */
    private ServiceImplementation lnkServiceImplementation;
}
