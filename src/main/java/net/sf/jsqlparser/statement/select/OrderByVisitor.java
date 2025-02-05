/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2019 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
package net.sf.jsqlparser.statement.select;

public interface OrderByVisitor<T> {

    <S> T visit(OrderByElement orderBy, S context);

    default void visit(OrderByElement orderBy) {
        this.visit(orderBy, null);
    }
}
