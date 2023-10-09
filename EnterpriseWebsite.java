public class EnterpriseWebsite extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("EnterpriseWebsite");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
