
package clases;

import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;

/**
 *
 * @author Estrada
 */
public class Pool {
    public DataSource dataSource;

    public String db = "SIGES";
    public String url = ("jdbc:sqlserver://DESKTOP-NJOINKB\\SQLEXPRESS;"
                    + "databaseName=SIGES;User=SIGES;Password=2020");

    public Pool(){

        inicializaDataSource();

    }
    private void inicializaDataSource(){
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("org.gjt.mm.mysql.Driver");
        basicDataSource.setUrl(url);
        basicDataSource.setMaxActive(50);
        dataSource = basicDataSource;
    }
}
