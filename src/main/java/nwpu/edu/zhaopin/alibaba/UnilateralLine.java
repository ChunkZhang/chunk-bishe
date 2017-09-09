package nwpu.edu.zhaopin.alibaba;

/**
 * Created by chunk on 2017/8/25.
 */
public class UnilateralLine {
    private String id;
    private String sCen;//出发分拨
    private String sPro;//出发省
    private String eCen;//到达分拨
    private String ePro;//到达省
    //9.6m/17.5m
    private String tType;//车型
    public UnilateralLine(String id, String sCen, String sPro, String eCen, String ePro,String tType) {
        this.id = id;this.sCen = sCen;this.sPro = sPro;this.eCen = eCen;this.ePro = ePro;this.tType = tType;}
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public String getSCen() {return sCen;}
    public void setSCen(String ePro) {this.ePro = ePro;}
    public String getSPro() {return sPro;}
    public void setSPro(String sPro) {this.sPro = sPro;}
    public String getECen() {return eCen;}
    public void setECen(String eCen) {this.eCen = eCen;}
    public String getEPro() {return ePro;}
    public void setEPro(String ePro) {this.ePro = ePro;}
    public String getTType() {return tType;}
    public void setTType(String tType) {this.tType = tType;}
}
