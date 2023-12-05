import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.engine.jdbc.connections.spi.JdbcConnectionAccess;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class OrderIdGenerator implements IdentifierGenerator {

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		String prefix = "OD";
		String suffix = "";
		try {
			JdbcConnectionAccess con = session.getJdbcConnectionAccess();
			Connection connect = con.obtainConnection();
			Statement stmt = connect.createStatement();
			String sql="select order_dtls_seq.next_val from dual";
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				int seqVal = rs.getInt(1);
				suffix = String.valueOf(seqVal);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		return prefix+suffix;
	}

}
