package com.lifeinide.jsonql.core.test;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author Lukasz Frankowski
 */
public interface IJsonQLTestEntity<ID extends Serializable> extends IJsonQLBaseTestEntity<ID> {

	String getStringVal();

	void setStringVal(String stringVal);

	boolean isBooleanVal();

	void setBooleanVal(boolean booleanVal);

	Long getLongVal();

	void setLongVal(Long longVal);

	BigDecimal getDecimalVal();

	void setDecimalVal(BigDecimal decimalVal);

	LocalDate getDateVal();

	void setDateVal(LocalDate dateVal);

	JsonQLTestEntityEnum getEnumVal();

	void setEnumVal(JsonQLTestEntityEnum enumVal);

}
