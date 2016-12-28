package org.kbs.hibernate.dialect;
import java.sql.Types;

import org.hibernate.HibernateException;
import org.hibernate.dialect.SQLServerDialect;

public class MySQLServerDialect extends SQLServerDialect {

 public MySQLServerDialect() {
  super();
  
  registerColumnType(Types.VARCHAR, "nvarchar($l)");
  registerColumnType(Types.BIGINT, "bigint");
  registerColumnType(Types.BIT, "bit");
 }

}