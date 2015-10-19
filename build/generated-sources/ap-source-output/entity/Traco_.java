package entity;

import entity.TracoAgregado;
import entity.Venda;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-10-08T19:04:19")
@StaticMetamodel(Traco.class)
public class Traco_ { 

    public static volatile SingularAttribute<Traco, Date> data;
    public static volatile SingularAttribute<Traco, String> slump;
    public static volatile CollectionAttribute<Traco, TracoAgregado> tracoAgregadoCollection;
    public static volatile SingularAttribute<Traco, Integer> id;
    public static volatile CollectionAttribute<Traco, Venda> vendaCollection;
    public static volatile SingularAttribute<Traco, Float> fck;
    public static volatile SingularAttribute<Traco, Float> aguaCentral;

}