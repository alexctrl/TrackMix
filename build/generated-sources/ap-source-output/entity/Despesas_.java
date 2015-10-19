package entity;

import entity.DespesasAplicacao;
import entity.DespesasArea;
import entity.DespesasFornecedor;
import entity.DespesasIdentificacaoequipamento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-10-08T19:04:19")
@StaticMetamodel(Despesas.class)
public class Despesas_ { 

    public static volatile SingularAttribute<Despesas, DespesasArea> despesasAreaId;
    public static volatile SingularAttribute<Despesas, DespesasIdentificacaoequipamento> despesasidentificacaoEquipamentoid;
    public static volatile SingularAttribute<Despesas, String> observacao;
    public static volatile SingularAttribute<Despesas, Date> data;
    public static volatile SingularAttribute<Despesas, Float> valor;
    public static volatile SingularAttribute<Despesas, DespesasAplicacao> despesasAplicacaoId;
    public static volatile SingularAttribute<Despesas, Integer> id;
    public static volatile SingularAttribute<Despesas, String> nota;
    public static volatile SingularAttribute<Despesas, DespesasFornecedor> despesasFornecedorId;

}