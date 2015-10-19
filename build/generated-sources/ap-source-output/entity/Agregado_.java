package entity;

import entity.AgregadoTipo;
import entity.TracoAgregado;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-10-08T19:04:19")
@StaticMetamodel(Agregado.class)
public class Agregado_ { 

    public static volatile SingularAttribute<Agregado, Float> preco;
    public static volatile SingularAttribute<Agregado, Integer> estoque;
    public static volatile SingularAttribute<Agregado, AgregadoTipo> agregadoTipoId;
    public static volatile SingularAttribute<Agregado, String> nome;
    public static volatile CollectionAttribute<Agregado, TracoAgregado> tracoAgregadoCollection;
    public static volatile SingularAttribute<Agregado, Integer> id;

}