package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta1FlowSchemaStatusFluent<A extends io.kubernetes.client.openapi.models.V1beta1FlowSchemaStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public A addToConditions(java.lang.Integer index,io.kubernetes.client.openapi.models.V1beta1FlowSchemaCondition item);
  public A setToConditions(java.lang.Integer index,io.kubernetes.client.openapi.models.V1beta1FlowSchemaCondition item);
  public A addToConditions(io.kubernetes.client.openapi.models.V1beta1FlowSchemaCondition... items);
  public A addAllToConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1FlowSchemaCondition> items);
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1beta1FlowSchemaCondition... items);
  public A removeAllFromConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1FlowSchemaCondition> items);
  public A removeMatchingFromConditions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1FlowSchemaConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1beta1FlowSchemaCondition> getConditions();
  public java.util.List<io.kubernetes.client.openapi.models.V1beta1FlowSchemaCondition> buildConditions();
  public io.kubernetes.client.openapi.models.V1beta1FlowSchemaCondition buildCondition(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1beta1FlowSchemaCondition buildFirstCondition();
  public io.kubernetes.client.openapi.models.V1beta1FlowSchemaCondition buildLastCondition();
  public io.kubernetes.client.openapi.models.V1beta1FlowSchemaCondition buildMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1FlowSchemaConditionBuilder> predicate);
  public java.lang.Boolean hasMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1FlowSchemaConditionBuilder> predicate);
  public A withConditions(java.util.List<io.kubernetes.client.openapi.models.V1beta1FlowSchemaCondition> conditions);
  public A withConditions(io.kubernetes.client.openapi.models.V1beta1FlowSchemaCondition... conditions);
  public java.lang.Boolean hasConditions();
  public io.kubernetes.client.openapi.models.V1beta1FlowSchemaStatusFluent.ConditionsNested<A> addNewCondition();
  public io.kubernetes.client.openapi.models.V1beta1FlowSchemaStatusFluent.ConditionsNested<A> addNewConditionLike(io.kubernetes.client.openapi.models.V1beta1FlowSchemaCondition item);
  public io.kubernetes.client.openapi.models.V1beta1FlowSchemaStatusFluent.ConditionsNested<A> setNewConditionLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1beta1FlowSchemaCondition item);
  public io.kubernetes.client.openapi.models.V1beta1FlowSchemaStatusFluent.ConditionsNested<A> editCondition(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1beta1FlowSchemaStatusFluent.ConditionsNested<A> editFirstCondition();
  public io.kubernetes.client.openapi.models.V1beta1FlowSchemaStatusFluent.ConditionsNested<A> editLastCondition();
  public io.kubernetes.client.openapi.models.V1beta1FlowSchemaStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1FlowSchemaConditionBuilder> predicate);
  public interface ConditionsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1FlowSchemaConditionFluent<io.kubernetes.client.openapi.models.V1beta1FlowSchemaStatusFluent.ConditionsNested<N>>{
    public N and();
    public N endCondition();
    
  }
  
}