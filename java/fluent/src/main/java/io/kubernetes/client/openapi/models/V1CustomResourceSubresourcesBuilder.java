package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1CustomResourceSubresourcesBuilder extends io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluentImpl<io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1CustomResourceSubresources,io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesBuilder>{
  public V1CustomResourceSubresourcesBuilder() {
    this(false);
  }
  public V1CustomResourceSubresourcesBuilder(java.lang.Boolean validationEnabled) {
    this(new V1CustomResourceSubresources(), validationEnabled);
  }
  public V1CustomResourceSubresourcesBuilder(io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CustomResourceSubresourcesBuilder(io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1CustomResourceSubresources(), validationEnabled);
  }
  public V1CustomResourceSubresourcesBuilder(io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluent<?> fluent,io.kubernetes.client.openapi.models.V1CustomResourceSubresources instance) {
    this(fluent, instance, false);
  }
  public V1CustomResourceSubresourcesBuilder(io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluent<?> fluent,io.kubernetes.client.openapi.models.V1CustomResourceSubresources instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withScale(instance.getScale());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1CustomResourceSubresourcesBuilder(io.kubernetes.client.openapi.models.V1CustomResourceSubresources instance) {
    this(instance,false);
  }
  public V1CustomResourceSubresourcesBuilder(io.kubernetes.client.openapi.models.V1CustomResourceSubresources instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withScale(instance.getScale());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1CustomResourceSubresources build() {
    V1CustomResourceSubresources buildable = new V1CustomResourceSubresources();
    buildable.setScale(fluent.getScale());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CustomResourceSubresourcesBuilder that = (V1CustomResourceSubresourcesBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}