package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1TopologySpreadConstraintBuilder extends io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluentImpl<io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1TopologySpreadConstraint,io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder>{
  public V1TopologySpreadConstraintBuilder() {
    this(false);
  }
  public V1TopologySpreadConstraintBuilder(java.lang.Boolean validationEnabled) {
    this(new V1TopologySpreadConstraint(), validationEnabled);
  }
  public V1TopologySpreadConstraintBuilder(io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent<?> fluent) {
    this(fluent, false);
  }
  public V1TopologySpreadConstraintBuilder(io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1TopologySpreadConstraint(), validationEnabled);
  }
  public V1TopologySpreadConstraintBuilder(io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent<?> fluent,io.kubernetes.client.openapi.models.V1TopologySpreadConstraint instance) {
    this(fluent, instance, false);
  }
  public V1TopologySpreadConstraintBuilder(io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent<?> fluent,io.kubernetes.client.openapi.models.V1TopologySpreadConstraint instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLabelSelector(instance.getLabelSelector());

    fluent.withMaxSkew(instance.getMaxSkew());

    fluent.withTopologyKey(instance.getTopologyKey());

    fluent.withWhenUnsatisfiable(instance.getWhenUnsatisfiable());

    this.validationEnabled = validationEnabled; 
  }
  public V1TopologySpreadConstraintBuilder(io.kubernetes.client.openapi.models.V1TopologySpreadConstraint instance) {
    this(instance,false);
  }
  public V1TopologySpreadConstraintBuilder(io.kubernetes.client.openapi.models.V1TopologySpreadConstraint instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withLabelSelector(instance.getLabelSelector());

    this.withMaxSkew(instance.getMaxSkew());

    this.withTopologyKey(instance.getTopologyKey());

    this.withWhenUnsatisfiable(instance.getWhenUnsatisfiable());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraint build() {
    V1TopologySpreadConstraint buildable = new V1TopologySpreadConstraint();
    buildable.setLabelSelector(fluent.getLabelSelector());
    buildable.setMaxSkew(fluent.getMaxSkew());
    buildable.setTopologyKey(fluent.getTopologyKey());
    buildable.setWhenUnsatisfiable(fluent.getWhenUnsatisfiable());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1TopologySpreadConstraintBuilder that = (V1TopologySpreadConstraintBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}