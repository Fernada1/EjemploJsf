package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Productos;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2023-01-16T22:22:45")
@StaticMetamodel(Categorias.class)
public class Categorias_ { 

    public static volatile SingularAttribute<Categorias, Integer> idcategorias;
    public static volatile CollectionAttribute<Categorias, Productos> productosCollection;
    public static volatile SingularAttribute<Categorias, String> nombrecategoria;

}