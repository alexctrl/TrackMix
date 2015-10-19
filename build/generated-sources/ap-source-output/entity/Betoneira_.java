package entity;

import entity.Venda;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-10-08T19:04:19")
@StaticMetamodel(Betoneira.class)
public class Betoneira_ { 

    public static volatile SingularAttribute<Betoneira, String> nome;
    public static volatile SingularAttribute<Betoneira, Integer> id;
    public static volatile CollectionAttribute<Betoneira, Venda> vendaCollection;

}