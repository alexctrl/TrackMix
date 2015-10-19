package entity;

import entity.Betoneira;
import entity.Bomba;
import entity.Traco;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-10-08T19:04:19")
@StaticMetamodel(Venda.class)
public class Venda_ { 

    public static volatile SingularAttribute<Venda, Betoneira> betoneiraId;
    public static volatile SingularAttribute<Venda, Bomba> bombaId;
    public static volatile SingularAttribute<Venda, Date> data;
    public static volatile SingularAttribute<Venda, Integer> id;
    public static volatile SingularAttribute<Venda, Traco> baseId;

}