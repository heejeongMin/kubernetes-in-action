package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1beta1RuntimeClassListBuilder extends io.kubernetes.client.openapi.models.V1beta1RuntimeClassListFluentImpl<io.kubernetes.client.openapi.models.V1beta1RuntimeClassListBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1RuntimeClassList,io.kubernetes.client.openapi.models.V1beta1RuntimeClassListBuilder>{
  public V1beta1RuntimeClassListBuilder() {
    this(false);
  }
  public V1beta1RuntimeClassListBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta1RuntimeClassList(), validationEnabled);
  }
  public V1beta1RuntimeClassListBuilder(io.kubernetes.client.openapi.models.V1beta1RuntimeClassListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1RuntimeClassListBuilder(io.kubernetes.client.openapi.models.V1beta1RuntimeClassListFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1RuntimeClassList(), validationEnabled);
  }
  public V1beta1RuntimeClassListBuilder(io.kubernetes.client.openapi.models.V1beta1RuntimeClassListFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1RuntimeClassList instance) {
    this(fluent, instance, false);
  }
  public V1beta1RuntimeClassListBuilder(io.kubernetes.client.openapi.models.V1beta1RuntimeClassListFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1RuntimeClassList instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1RuntimeClassListBuilder(io.kubernetes.client.openapi.models.V1beta1RuntimeClassList instance) {
    this(instance,false);
  }
  public V1beta1RuntimeClassListBuilder(io.kubernetes.client.openapi.models.V1beta1RuntimeClassList instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1beta1RuntimeClassListFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1beta1RuntimeClassList build() {
    V1beta1RuntimeClassList buildable = new V1beta1RuntimeClassList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta1RuntimeClassListBuilder that = (V1beta1RuntimeClassListBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}