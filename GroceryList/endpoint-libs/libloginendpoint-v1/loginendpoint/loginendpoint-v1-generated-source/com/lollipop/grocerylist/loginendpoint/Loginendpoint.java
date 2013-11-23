/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2013-10-30 15:57:41 UTC)
 * on 2013-11-08 at 13:08:33 UTC 
 * Modify at your own risk.
 */

package com.lollipop.grocerylist.loginendpoint;

/**
 * Service definition for Loginendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link LoginendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Loginendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.16.0-rc of the loginendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://grocery-lists.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "loginendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Loginendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Loginendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getLogIn".
   *
   * This request holds the parameters needed by the the loginendpoint server.  After setting any
   * optional parameters, call the {@link GetLogIn#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetLogIn getLogIn(java.lang.Long id) throws java.io.IOException {
    GetLogIn result = new GetLogIn(id);
    initialize(result);
    return result;
  }

  public class GetLogIn extends LoginendpointRequest<com.lollipop.grocerylist.loginendpoint.model.LogIn> {

    private static final String REST_PATH = "login/{id}";

    /**
     * Create a request for the method "getLogIn".
     *
     * This request holds the parameters needed by the the loginendpoint server.  After setting any
     * optional parameters, call the {@link GetLogIn#execute()} method to invoke the remote operation.
     * <p> {@link
     * GetLogIn#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetLogIn(java.lang.Long id) {
      super(Loginendpoint.this, "GET", REST_PATH, null, com.lollipop.grocerylist.loginendpoint.model.LogIn.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetLogIn setAlt(java.lang.String alt) {
      return (GetLogIn) super.setAlt(alt);
    }

    @Override
    public GetLogIn setFields(java.lang.String fields) {
      return (GetLogIn) super.setFields(fields);
    }

    @Override
    public GetLogIn setKey(java.lang.String key) {
      return (GetLogIn) super.setKey(key);
    }

    @Override
    public GetLogIn setOauthToken(java.lang.String oauthToken) {
      return (GetLogIn) super.setOauthToken(oauthToken);
    }

    @Override
    public GetLogIn setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetLogIn) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetLogIn setQuotaUser(java.lang.String quotaUser) {
      return (GetLogIn) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetLogIn setUserIp(java.lang.String userIp) {
      return (GetLogIn) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetLogIn setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetLogIn set(String parameterName, Object value) {
      return (GetLogIn) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertLogIn".
   *
   * This request holds the parameters needed by the the loginendpoint server.  After setting any
   * optional parameters, call the {@link InsertLogIn#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.lollipop.grocerylist.loginendpoint.model.LogIn}
   * @return the request
   */
  public InsertLogIn insertLogIn(com.lollipop.grocerylist.loginendpoint.model.LogIn content) throws java.io.IOException {
    InsertLogIn result = new InsertLogIn(content);
    initialize(result);
    return result;
  }

  public class InsertLogIn extends LoginendpointRequest<com.lollipop.grocerylist.loginendpoint.model.LogIn> {

    private static final String REST_PATH = "login";

    /**
     * Create a request for the method "insertLogIn".
     *
     * This request holds the parameters needed by the the loginendpoint server.  After setting any
     * optional parameters, call the {@link InsertLogIn#execute()} method to invoke the remote
     * operation. <p> {@link
     * InsertLogIn#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.lollipop.grocerylist.loginendpoint.model.LogIn}
     * @since 1.13
     */
    protected InsertLogIn(com.lollipop.grocerylist.loginendpoint.model.LogIn content) {
      super(Loginendpoint.this, "POST", REST_PATH, content, com.lollipop.grocerylist.loginendpoint.model.LogIn.class);
    }

    @Override
    public InsertLogIn setAlt(java.lang.String alt) {
      return (InsertLogIn) super.setAlt(alt);
    }

    @Override
    public InsertLogIn setFields(java.lang.String fields) {
      return (InsertLogIn) super.setFields(fields);
    }

    @Override
    public InsertLogIn setKey(java.lang.String key) {
      return (InsertLogIn) super.setKey(key);
    }

    @Override
    public InsertLogIn setOauthToken(java.lang.String oauthToken) {
      return (InsertLogIn) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertLogIn setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertLogIn) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertLogIn setQuotaUser(java.lang.String quotaUser) {
      return (InsertLogIn) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertLogIn setUserIp(java.lang.String userIp) {
      return (InsertLogIn) super.setUserIp(userIp);
    }

    @Override
    public InsertLogIn set(String parameterName, Object value) {
      return (InsertLogIn) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listLogIn".
   *
   * This request holds the parameters needed by the the loginendpoint server.  After setting any
   * optional parameters, call the {@link ListLogIn#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public ListLogIn listLogIn() throws java.io.IOException {
    ListLogIn result = new ListLogIn();
    initialize(result);
    return result;
  }

  public class ListLogIn extends LoginendpointRequest<com.lollipop.grocerylist.loginendpoint.model.CollectionResponseLogIn> {

    private static final String REST_PATH = "login";

    /**
     * Create a request for the method "listLogIn".
     *
     * This request holds the parameters needed by the the loginendpoint server.  After setting any
     * optional parameters, call the {@link ListLogIn#execute()} method to invoke the remote
     * operation. <p> {@link
     * ListLogIn#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListLogIn() {
      super(Loginendpoint.this, "GET", REST_PATH, null, com.lollipop.grocerylist.loginendpoint.model.CollectionResponseLogIn.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListLogIn setAlt(java.lang.String alt) {
      return (ListLogIn) super.setAlt(alt);
    }

    @Override
    public ListLogIn setFields(java.lang.String fields) {
      return (ListLogIn) super.setFields(fields);
    }

    @Override
    public ListLogIn setKey(java.lang.String key) {
      return (ListLogIn) super.setKey(key);
    }

    @Override
    public ListLogIn setOauthToken(java.lang.String oauthToken) {
      return (ListLogIn) super.setOauthToken(oauthToken);
    }

    @Override
    public ListLogIn setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListLogIn) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListLogIn setQuotaUser(java.lang.String quotaUser) {
      return (ListLogIn) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListLogIn setUserIp(java.lang.String userIp) {
      return (ListLogIn) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListLogIn setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListLogIn setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListLogIn set(String parameterName, Object value) {
      return (ListLogIn) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeLogIn".
   *
   * This request holds the parameters needed by the the loginendpoint server.  After setting any
   * optional parameters, call the {@link RemoveLogIn#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public RemoveLogIn removeLogIn(java.lang.Long id) throws java.io.IOException {
    RemoveLogIn result = new RemoveLogIn(id);
    initialize(result);
    return result;
  }

  public class RemoveLogIn extends LoginendpointRequest<Void> {

    private static final String REST_PATH = "login/{id}";

    /**
     * Create a request for the method "removeLogIn".
     *
     * This request holds the parameters needed by the the loginendpoint server.  After setting any
     * optional parameters, call the {@link RemoveLogIn#execute()} method to invoke the remote
     * operation. <p> {@link
     * RemoveLogIn#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveLogIn(java.lang.Long id) {
      super(Loginendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveLogIn setAlt(java.lang.String alt) {
      return (RemoveLogIn) super.setAlt(alt);
    }

    @Override
    public RemoveLogIn setFields(java.lang.String fields) {
      return (RemoveLogIn) super.setFields(fields);
    }

    @Override
    public RemoveLogIn setKey(java.lang.String key) {
      return (RemoveLogIn) super.setKey(key);
    }

    @Override
    public RemoveLogIn setOauthToken(java.lang.String oauthToken) {
      return (RemoveLogIn) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveLogIn setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveLogIn) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveLogIn setQuotaUser(java.lang.String quotaUser) {
      return (RemoveLogIn) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveLogIn setUserIp(java.lang.String userIp) {
      return (RemoveLogIn) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public RemoveLogIn setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveLogIn set(String parameterName, Object value) {
      return (RemoveLogIn) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateLogIn".
   *
   * This request holds the parameters needed by the the loginendpoint server.  After setting any
   * optional parameters, call the {@link UpdateLogIn#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.lollipop.grocerylist.loginendpoint.model.LogIn}
   * @return the request
   */
  public UpdateLogIn updateLogIn(com.lollipop.grocerylist.loginendpoint.model.LogIn content) throws java.io.IOException {
    UpdateLogIn result = new UpdateLogIn(content);
    initialize(result);
    return result;
  }

  public class UpdateLogIn extends LoginendpointRequest<com.lollipop.grocerylist.loginendpoint.model.LogIn> {

    private static final String REST_PATH = "login";

    /**
     * Create a request for the method "updateLogIn".
     *
     * This request holds the parameters needed by the the loginendpoint server.  After setting any
     * optional parameters, call the {@link UpdateLogIn#execute()} method to invoke the remote
     * operation. <p> {@link
     * UpdateLogIn#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.lollipop.grocerylist.loginendpoint.model.LogIn}
     * @since 1.13
     */
    protected UpdateLogIn(com.lollipop.grocerylist.loginendpoint.model.LogIn content) {
      super(Loginendpoint.this, "PUT", REST_PATH, content, com.lollipop.grocerylist.loginendpoint.model.LogIn.class);
    }

    @Override
    public UpdateLogIn setAlt(java.lang.String alt) {
      return (UpdateLogIn) super.setAlt(alt);
    }

    @Override
    public UpdateLogIn setFields(java.lang.String fields) {
      return (UpdateLogIn) super.setFields(fields);
    }

    @Override
    public UpdateLogIn setKey(java.lang.String key) {
      return (UpdateLogIn) super.setKey(key);
    }

    @Override
    public UpdateLogIn setOauthToken(java.lang.String oauthToken) {
      return (UpdateLogIn) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateLogIn setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateLogIn) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateLogIn setQuotaUser(java.lang.String quotaUser) {
      return (UpdateLogIn) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateLogIn setUserIp(java.lang.String userIp) {
      return (UpdateLogIn) super.setUserIp(userIp);
    }

    @Override
    public UpdateLogIn set(String parameterName, Object value) {
      return (UpdateLogIn) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Loginendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Loginendpoint}. */
    @Override
    public Loginendpoint build() {
      return new Loginendpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link LoginendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setLoginendpointRequestInitializer(
        LoginendpointRequestInitializer loginendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(loginendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
