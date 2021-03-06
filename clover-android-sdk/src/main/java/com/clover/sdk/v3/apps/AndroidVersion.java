/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2013 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.apps;

@SuppressWarnings("all")
public final class AndroidVersion implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.lang.String getId() {
    return cacheGet(CacheKey.id);
  }
 /**
   * Creation timestamp
  */
  public java.lang.Long getCreatedAt() {
    return cacheGet(CacheKey.createdAt);
  }
 /**
   * Unique identifier
  */
  public java.lang.Long getVersion() {
    return cacheGet(CacheKey.version);
  }
  public java.lang.String getVersionName() {
    return cacheGet(CacheKey.versionName);
  }
  public java.lang.Boolean getApproved() {
    return cacheGet(CacheKey.approved);
  }
  public java.lang.String getHash() {
    return cacheGet(CacheKey.hash);
  }
  public java.lang.String getHashOriginal() {
    return cacheGet(CacheKey.hashOriginal);
  }
  public com.clover.sdk.v3.base.ApprovalStatus getApprovalStatus() {
    return cacheGet(CacheKey.approvalStatus);
  }
 /**
   * Url to download the APK
  */
  public java.lang.String getApkUrl() {
    return cacheGet(CacheKey.apkUrl);
  }
 /**
   * Reference to app this android version belongs to
  */
  public com.clover.sdk.v3.base.Reference getApp() {
    return cacheGet(CacheKey.app);
  }


  private enum CacheKey {
    id {
      @Override
      public Object extractValue(AndroidVersion instance) {
        return instance.extractId();
      }
    },
    createdAt {
      @Override
      public Object extractValue(AndroidVersion instance) {
        return instance.extractCreatedAt();
      }
    },
    version {
      @Override
      public Object extractValue(AndroidVersion instance) {
        return instance.extractVersion();
      }
    },
    versionName {
      @Override
      public Object extractValue(AndroidVersion instance) {
        return instance.extractVersionName();
      }
    },
    approved {
      @Override
      public Object extractValue(AndroidVersion instance) {
        return instance.extractApproved();
      }
    },
    hash {
      @Override
      public Object extractValue(AndroidVersion instance) {
        return instance.extractHash();
      }
    },
    hashOriginal {
      @Override
      public Object extractValue(AndroidVersion instance) {
        return instance.extractHashOriginal();
      }
    },
    approvalStatus {
      @Override
      public Object extractValue(AndroidVersion instance) {
        return instance.extractApprovalStatus();
      }
    },
    apkUrl {
      @Override
      public Object extractValue(AndroidVersion instance) {
        return instance.extractApkUrl();
      }
    },
    app {
      @Override
      public Object extractValue(AndroidVersion instance) {
        return instance.extractApp();
      }
    },
    ;

    public abstract Object extractValue(AndroidVersion instance);
  }

  private org.json.JSONObject jsonObject = null;
  private android.os.Bundle bundle = null;
  private android.os.Bundle changeLog = null;
  private Object[] cache = null;
  private byte[] cacheState = null;

  private static final byte STATE_NOT_CACHED = 0;
  private static final byte STATE_CACHED_NO_VALUE = 1;
  private static final byte STATE_CACHED_VALUE = 2;

  /**
   * Constructs a new empty instance.
   */
  public AndroidVersion() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public AndroidVersion(String json) throws java.lang.IllegalArgumentException {
    try {
      this.jsonObject = new org.json.JSONObject(json);
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public AndroidVersion(org.json.JSONObject jsonObject) {
    this.jsonObject = jsonObject;
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public AndroidVersion(AndroidVersion src) {
    if (src.jsonObject != null) {
      this.jsonObject = com.clover.sdk.v3.JsonHelper.deepCopy(src.getJSONObject());
    }
  }

  private <T> T cacheGet(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return (T) cache[index];
  }

  private boolean cacheValueIsNotNull(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return cache[index] != null;
  }

  private boolean cacheHasKey(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return cacheState[index] == STATE_CACHED_VALUE;
  }

  private void cacheRemoveValue(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    cache[index] = null;
    cacheState[index] = STATE_CACHED_NO_VALUE;
  }

  private void cacheMarkDirty(CacheKey key) {
    if (cache != null) {
      int index = key.ordinal();
      cache[index] = null;
      cacheState[index] = STATE_NOT_CACHED;
    }
  }

  private void populateCache(int index) {
    if (cache == null) {
      int size = CacheKey.values().length;
      cache = new Object[size];
      cacheState = new byte[size];
    }

    if (cacheState[index] == STATE_NOT_CACHED) {
      CacheKey key = CacheKey.values()[index];

      if (getJSONObject().has(key.name())) {
        cache[index] = key.extractValue(this);
        cacheState[index] = STATE_CACHED_VALUE;
      } else {
        cacheState[index] = STATE_CACHED_NO_VALUE;
      }
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    if (jsonObject == null) {
      jsonObject = new org.json.JSONObject();
    }
    return jsonObject;
  }


  @Override
  public void validate() {
    java.lang.String id = getId();
    if (id != null && id.length() > 13) { throw new IllegalArgumentException("Maximum string length exceeded for 'id'");}

    java.lang.String versionName = getVersionName();
    if (versionName != null && versionName.length() > 255) { throw new IllegalArgumentException("Maximum string length exceeded for 'versionName'");}

    java.lang.String hash = getHash();
    if (hash != null && hash.length() > 64) { throw new IllegalArgumentException("Maximum string length exceeded for 'hash'");}

    java.lang.String hashOriginal = getHashOriginal();
    if (hashOriginal != null && hashOriginal.length() > 64) { throw new IllegalArgumentException("Maximum string length exceeded for 'hashOriginal'");}
  }



  private java.lang.String extractId() {
    return getJSONObject().isNull("id") ? null :
      getJSONObject().optString("id");
  }


  private java.lang.Long extractCreatedAt() {
    return getJSONObject().isNull("createdAt") ? null :
      getJSONObject().optLong("createdAt");
  }


  private java.lang.Long extractVersion() {
    return getJSONObject().isNull("version") ? null :
      getJSONObject().optLong("version");
  }


  private java.lang.String extractVersionName() {
    return getJSONObject().isNull("versionName") ? null :
      getJSONObject().optString("versionName");
  }


  private java.lang.Boolean extractApproved() {
    return getJSONObject().isNull("approved") ? null :
      getJSONObject().optBoolean("approved");
  }


  private java.lang.String extractHash() {
    return getJSONObject().isNull("hash") ? null :
      getJSONObject().optString("hash");
  }


  private java.lang.String extractHashOriginal() {
    return getJSONObject().isNull("hashOriginal") ? null :
      getJSONObject().optString("hashOriginal");
  }


  private com.clover.sdk.v3.base.ApprovalStatus extractApprovalStatus() {
    if (!getJSONObject().isNull("approvalStatus")) {
      try {
        return com.clover.sdk.v3.base.ApprovalStatus.valueOf(getJSONObject().optString("approvalStatus"));
      } catch(Exception e) {
        e.printStackTrace();
      }
    }

    return null;
  }


  private java.lang.String extractApkUrl() {
    return getJSONObject().isNull("apkUrl") ? null :
      getJSONObject().optString("apkUrl");
  }


  private com.clover.sdk.v3.base.Reference extractApp() {
    org.json.JSONObject jsonObj = getJSONObject().optJSONObject("app");
    if (jsonObj != null) {
      return new com.clover.sdk.v3.base.Reference(getJSONObject().optJSONObject("app"));
    }
    return null;
  }


  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'createdAt' field is set and is not null */
  public boolean isNotNullCreatedAt() {
    return cacheValueIsNotNull(CacheKey.createdAt);
  }

  /** Checks whether the 'version' field is set and is not null */
  public boolean isNotNullVersion() {
    return cacheValueIsNotNull(CacheKey.version);
  }

  /** Checks whether the 'versionName' field is set and is not null */
  public boolean isNotNullVersionName() {
    return cacheValueIsNotNull(CacheKey.versionName);
  }

  /** Checks whether the 'approved' field is set and is not null */
  public boolean isNotNullApproved() {
    return cacheValueIsNotNull(CacheKey.approved);
  }

  /** Checks whether the 'hash' field is set and is not null */
  public boolean isNotNullHash() {
    return cacheValueIsNotNull(CacheKey.hash);
  }

  /** Checks whether the 'hashOriginal' field is set and is not null */
  public boolean isNotNullHashOriginal() {
    return cacheValueIsNotNull(CacheKey.hashOriginal);
  }

  /** Checks whether the 'approvalStatus' field is set and is not null */
  public boolean isNotNullApprovalStatus() {
    return cacheValueIsNotNull(CacheKey.approvalStatus);
  }

  /** Checks whether the 'apkUrl' field is set and is not null */
  public boolean isNotNullApkUrl() {
    return cacheValueIsNotNull(CacheKey.apkUrl);
  }

  /** Checks whether the 'app' field is set and is not null */
  public boolean isNotNullApp() {
    return cacheValueIsNotNull(CacheKey.app);
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'createdAt' field has been set, however the value could be null */
  public boolean hasCreatedAt() {
    return cacheHasKey(CacheKey.createdAt);
  }

  /** Checks whether the 'version' field has been set, however the value could be null */
  public boolean hasVersion() {
    return cacheHasKey(CacheKey.version);
  }

  /** Checks whether the 'versionName' field has been set, however the value could be null */
  public boolean hasVersionName() {
    return cacheHasKey(CacheKey.versionName);
  }

  /** Checks whether the 'approved' field has been set, however the value could be null */
  public boolean hasApproved() {
    return cacheHasKey(CacheKey.approved);
  }

  /** Checks whether the 'hash' field has been set, however the value could be null */
  public boolean hasHash() {
    return cacheHasKey(CacheKey.hash);
  }

  /** Checks whether the 'hashOriginal' field has been set, however the value could be null */
  public boolean hasHashOriginal() {
    return cacheHasKey(CacheKey.hashOriginal);
  }

  /** Checks whether the 'approvalStatus' field has been set, however the value could be null */
  public boolean hasApprovalStatus() {
    return cacheHasKey(CacheKey.approvalStatus);
  }

  /** Checks whether the 'apkUrl' field has been set, however the value could be null */
  public boolean hasApkUrl() {
    return cacheHasKey(CacheKey.apkUrl);
  }

  /** Checks whether the 'app' field has been set, however the value could be null */
  public boolean hasApp() {
    return cacheHasKey(CacheKey.app);
  }


  /**
   * Sets the field 'id'.
   */
  public AndroidVersion setId(java.lang.String id) {
    logChange("id");

    try {
      getJSONObject().put("id", id == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(id));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.id);
    return this;
  }

  /**
   * Sets the field 'createdAt'.
   */
  public AndroidVersion setCreatedAt(java.lang.Long createdAt) {
    logChange("createdAt");

    try {
      getJSONObject().put("createdAt", createdAt == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(createdAt));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.createdAt);
    return this;
  }

  /**
   * Sets the field 'version'.
   */
  public AndroidVersion setVersion(java.lang.Long version) {
    logChange("version");

    try {
      getJSONObject().put("version", version == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(version));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.version);
    return this;
  }

  /**
   * Sets the field 'versionName'.
   */
  public AndroidVersion setVersionName(java.lang.String versionName) {
    logChange("versionName");

    try {
      getJSONObject().put("versionName", versionName == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(versionName));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.versionName);
    return this;
  }

  /**
   * Sets the field 'approved'.
   */
  public AndroidVersion setApproved(java.lang.Boolean approved) {
    logChange("approved");

    try {
      getJSONObject().put("approved", approved == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(approved));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.approved);
    return this;
  }

  /**
   * Sets the field 'hash'.
   */
  public AndroidVersion setHash(java.lang.String hash) {
    logChange("hash");

    try {
      getJSONObject().put("hash", hash == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(hash));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.hash);
    return this;
  }

  /**
   * Sets the field 'hashOriginal'.
   */
  public AndroidVersion setHashOriginal(java.lang.String hashOriginal) {
    logChange("hashOriginal");

    try {
      getJSONObject().put("hashOriginal", hashOriginal == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(hashOriginal));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.hashOriginal);
    return this;
  }

  /**
   * Sets the field 'approvalStatus'.
   */
  public AndroidVersion setApprovalStatus(com.clover.sdk.v3.base.ApprovalStatus approvalStatus) {
    logChange("approvalStatus");

    try {
      getJSONObject().put("approvalStatus", approvalStatus == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(approvalStatus));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.approvalStatus);
    return this;
  }

  /**
   * Sets the field 'apkUrl'.
   */
  public AndroidVersion setApkUrl(java.lang.String apkUrl) {
    logChange("apkUrl");

    try {
      getJSONObject().put("apkUrl", apkUrl == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(apkUrl));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.apkUrl);
    return this;
  }

  /**
   * Sets the field 'app'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public AndroidVersion setApp(com.clover.sdk.v3.base.Reference app) {
    logChange("app");

    try {
      getJSONObject().put("app",
          app == null ? org.json.JSONObject.NULL : app.getJSONObject());
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.app);
    return this;
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    unlogChange("id");
    getJSONObject().remove("id");
    cacheRemoveValue(CacheKey.id);
  }

  /** Clears the 'createdAt' field, the 'has' method for this field will now return false */
  public void clearCreatedAt() {
    unlogChange("createdAt");
    getJSONObject().remove("createdAt");
    cacheRemoveValue(CacheKey.createdAt);
  }

  /** Clears the 'version' field, the 'has' method for this field will now return false */
  public void clearVersion() {
    unlogChange("version");
    getJSONObject().remove("version");
    cacheRemoveValue(CacheKey.version);
  }

  /** Clears the 'versionName' field, the 'has' method for this field will now return false */
  public void clearVersionName() {
    unlogChange("versionName");
    getJSONObject().remove("versionName");
    cacheRemoveValue(CacheKey.versionName);
  }

  /** Clears the 'approved' field, the 'has' method for this field will now return false */
  public void clearApproved() {
    unlogChange("approved");
    getJSONObject().remove("approved");
    cacheRemoveValue(CacheKey.approved);
  }

  /** Clears the 'hash' field, the 'has' method for this field will now return false */
  public void clearHash() {
    unlogChange("hash");
    getJSONObject().remove("hash");
    cacheRemoveValue(CacheKey.hash);
  }

  /** Clears the 'hashOriginal' field, the 'has' method for this field will now return false */
  public void clearHashOriginal() {
    unlogChange("hashOriginal");
    getJSONObject().remove("hashOriginal");
    cacheRemoveValue(CacheKey.hashOriginal);
  }

  /** Clears the 'approvalStatus' field, the 'has' method for this field will now return false */
  public void clearApprovalStatus() {
    unlogChange("approvalStatus");
    getJSONObject().remove("approvalStatus");
    cacheRemoveValue(CacheKey.approvalStatus);
  }

  /** Clears the 'apkUrl' field, the 'has' method for this field will now return false */
  public void clearApkUrl() {
    unlogChange("apkUrl");
    getJSONObject().remove("apkUrl");
    cacheRemoveValue(CacheKey.apkUrl);
  }

  /** Clears the 'app' field, the 'has' method for this field will now return false */
  public void clearApp() {
    unlogChange("app");
    getJSONObject().remove("app");
    cacheRemoveValue(CacheKey.app);
  }


  private void logChange(java.lang.String field) {
    if (changeLog == null) {
      changeLog = new android.os.Bundle();
    }
    changeLog.putString(field, null);
  }

  private void unlogChange(java.lang.String field) {
    if (changeLog != null) {
      changeLog.remove(field);
    }
  }

  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return changeLog != null;
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    changeLog = null;
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public AndroidVersion copyChanges() {
    AndroidVersion copy = new AndroidVersion();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(AndroidVersion src) {
    if (src.changeLog != null) {
      try {
        // Make a copy of the source so the destination fields are copies
        org.json.JSONObject srcObj = new AndroidVersion(src).getJSONObject();
        org.json.JSONObject dstObj = getJSONObject();
        for (java.lang.String field : src.changeLog.keySet()) {
          dstObj.put(field, srcObj.get(field));
          logChange(field);
        }
      } catch (org.json.JSONException e) {
        throw new java.lang.IllegalArgumentException(e);
      }
    }
  }


  /**
   * Gets a Bundle which can be used to get and set data attached to this instance. The attached Bundle will be
   * parcelled but not jsonified.
   */
  public android.os.Bundle getBundle() {
    if (bundle == null) {
      bundle = new android.os.Bundle();
    }
    return bundle;
  }

  @Override
  public String toString() {
    String json = getJSONObject().toString();

    if (bundle != null) {
      bundle.isEmpty(); // Triggers unparcel
    }

    if (changeLog != null) {
      changeLog.isEmpty(); // Triggers unparcel
    }

    return "AndroidVersion{" +
        "json='" + json + "'" +
        ", bundle=" + bundle +
        ", changeLog=" + changeLog +
        '}';
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(android.os.Parcel dest, int flags) {
	  com.clover.sdk.v3.JsonParcelHelper.wrap(getJSONObject()).writeToParcel(dest, 0);
    dest.writeBundle(bundle);
    dest.writeBundle(changeLog);
  }

  public static final android.os.Parcelable.Creator<AndroidVersion> CREATOR = new android.os.Parcelable.Creator<AndroidVersion>() {
    @Override
    public AndroidVersion createFromParcel(android.os.Parcel in) {
      AndroidVersion instance = new AndroidVersion(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.bundle = in.readBundle(getClass().getClassLoader());
      instance.changeLog = in.readBundle();
      return instance;
    }

    @Override
    public AndroidVersion[] newArray(int size) {
      return new AndroidVersion[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<AndroidVersion> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<AndroidVersion>() {
    @Override
    public AndroidVersion create(org.json.JSONObject jsonObject) {
      return new AndroidVersion(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean CREATEDAT_IS_REQUIRED = false;

    public static final boolean VERSION_IS_REQUIRED = false;

    public static final boolean VERSIONNAME_IS_REQUIRED = false;
    public static final long VERSIONNAME_MAX_LEN = 255;

    public static final boolean APPROVED_IS_REQUIRED = false;

    public static final boolean HASH_IS_REQUIRED = false;
    public static final long HASH_MAX_LEN = 64;

    public static final boolean HASHORIGINAL_IS_REQUIRED = false;
    public static final long HASHORIGINAL_MAX_LEN = 64;

    public static final boolean APPROVALSTATUS_IS_REQUIRED = false;

    public static final boolean APKURL_IS_REQUIRED = false;

    public static final boolean APP_IS_REQUIRED = false;

  }

}
