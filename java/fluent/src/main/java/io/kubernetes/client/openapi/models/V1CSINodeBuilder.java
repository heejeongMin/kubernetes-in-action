package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1CSINodeBuilder extends io.kubernetes.client.openapi.models.V1CSINodeFluentImpl<io.kubernetes.client.openapi.models.V1CSINodeBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1CSINode,io.kubernetes.client.openapi.models.V1CSINodeBuilder>{
  public V1CSINodeBuilder() {
    this(false);
  }
  public V1CSINodeBuilder(java.lang.Boolean validationEnabled) {
    this(new V1CSINode(), validationEnabled);
  }
  public V1CSINodeBuilder(io.kubernetes.client.openapi.models.V1CSINodeFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CSINodeBuilder(io.kubernetes.client.openapi.models.V1CSINodeFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1CSINode(), validationEnabled);
  }
  public V1CSINodeBuilder(io.kubernetes.client.openapi.models.V1CSINodeFluent<?> fluent,io.kubernetes.client.openapi.models.V1CSINode instance) {
    this(fluent, instance, false);
  }
  public V1CSINodeBuilder(io.kubernetes.client.openapi.models.V1CSINodeFluent<?> fluent,io.kubernetes.client.openapi.models.V1CSINode instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled; 
  }
  public V1CSINodeBuilder(io.kubernetes.client.openapi.models.V1CSINode instance) {
    this(instance,false);
  }
  public V1CSINodeBuilder(io.kubernetes.client.openapi.models.V1CSINode instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1CSINodeFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1CSINode build() {
    V1CSINode buildable = new V1CSINode();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CSINodeBuilder that = (V1CSINodeBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}