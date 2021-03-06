package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1JobTemplateSpecFluent<A extends io.kubernetes.client.openapi.models.V1JobTemplateSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata();
  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();
  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);
  public java.lang.Boolean hasMetadata();
  public io.kubernetes.client.openapi.models.V1JobTemplateSpecFluent.MetadataNested<A> withNewMetadata();
  public io.kubernetes.client.openapi.models.V1JobTemplateSpecFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  public io.kubernetes.client.openapi.models.V1JobTemplateSpecFluent.MetadataNested<A> editMetadata();
  public io.kubernetes.client.openapi.models.V1JobTemplateSpecFluent.MetadataNested<A> editOrNewMetadata();
  public io.kubernetes.client.openapi.models.V1JobTemplateSpecFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1JobSpec getSpec();
  public io.kubernetes.client.openapi.models.V1JobSpec buildSpec();
  public A withSpec(io.kubernetes.client.openapi.models.V1JobSpec spec);
  public java.lang.Boolean hasSpec();
  public io.kubernetes.client.openapi.models.V1JobTemplateSpecFluent.SpecNested<A> withNewSpec();
  public io.kubernetes.client.openapi.models.V1JobTemplateSpecFluent.SpecNested<A> withNewSpecLike(io.kubernetes.client.openapi.models.V1JobSpec item);
  public io.kubernetes.client.openapi.models.V1JobTemplateSpecFluent.SpecNested<A> editSpec();
  public io.kubernetes.client.openapi.models.V1JobTemplateSpecFluent.SpecNested<A> editOrNewSpec();
  public io.kubernetes.client.openapi.models.V1JobTemplateSpecFluent.SpecNested<A> editOrNewSpecLike(io.kubernetes.client.openapi.models.V1JobSpec item);
  public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ObjectMetaFluent<io.kubernetes.client.openapi.models.V1JobTemplateSpecFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1JobSpecFluent<io.kubernetes.client.openapi.models.V1JobTemplateSpecFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  
}