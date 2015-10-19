package entity;

import entity.Despesas;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-10-08T19:04:19")
@StaticMetamodel(DespesasFornecedor.class)
public class DespesasFornecedor_ { 

    public static volatile CollectionAttribute<DespesasFornecedor, Despesas> despesasCollection;
    public static volatile SingularAttribute<DespesasFornecedor, Short> id;
    public static volatile SingularAttribute<DespesasFornecedor, String> fornecedor;

}