package ingsoft.patrones.proxy;

import java.util.Arrays;
import java.util.List;

public class ProxyInternetService implements InternetService {
  private RealInternetService realInternetService;
  private static final List<String> BANNED_SITES = Arrays.asList("facebook.com", "instagram.com");

  public ProxyInternetService() {
    this.realInternetService = new RealInternetService();
  }

  @Override
  public String connectTo(String url) {
    if (BANNED_SITES.contains(url)) {
      return "Access denied: Connection to " + url + " is not allowed";
    }
    return realInternetService.connectTo(url);
  }
}
