
package utils;

/**
 *
 * @author Iván Miranda
 */
public class ServerConnection {
  
  private String name;
  private String category;
  private String OS;
  private String mac;
  private String protocol;
  private String linker;
  private String range;

  public ServerConnection() {
  }

  public String getName() {
    return name;
  }

  public String getCategory() {
    return category;
  }

  public String getOS() {
    return OS;
  }

  public String getMac() {
    return mac;
  }

  public String getProtocol() {
    return protocol;
  }

  public String getLinker() {
    return linker;
  }

  public String getRange() {
    return range;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public void setOS(String OS) {
    this.OS = OS;
  }

  public void setMac(String mac) {
    this.mac = mac;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public void setLinker(String linker) {
    this.linker = linker;
  }

  public void setRange(String range) {
    this.range = range;
  }
}
