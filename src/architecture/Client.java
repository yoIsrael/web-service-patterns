/* Generated by Together */

package architecture;

public class Client {
    private Presentation lnkPresentation;
    private Middle lnkMiddle;
    private Web lnkWeb;

    /**
     * @label locate
     * @directed 
     */
    private Directory lnkDirectory;

    /**
     * @label bind and communicate 
     */
    private Service lnkService;

    /**
     * @label lookup (XML)
     * @directed 
     */
    private UDDI lnkClient;
}
