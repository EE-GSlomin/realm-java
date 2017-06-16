package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.LinkView;
import io.realm.internal.OsObject;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.SharedRealm;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.log.RealmLog;


interface AllTypesRealmProxyInterface {
    String realmGet$columnString();

    void realmSet$columnString(String value);

    long realmGet$columnLong();

    void realmSet$columnLong(long value);

    void realmSet$columnFloat(float value);

    float realmGet$columnFloat();

    double realmGet$columnDouble();

    void realmSet$columnDouble(double value);

    boolean realmGet$columnBoolean();

    void realmSet$columnBoolean(boolean value);

    Date realmGet$columnDate();

    void realmSet$columnDate(Date value);

    byte[] realmGet$columnBinary();

    void realmSet$columnBinary(byte[] value);

    io.realm.entities.AllTypes realmGet$columnObject();

    void realmSet$columnObject(io.realm.entities.AllTypes value);

    MutableRealmInteger realmGet$columnCounter();

    RealmList<io.realm.entities.AllTypes> realmGet$columnRealmList();

    void realmSet$columnRealmList(RealmList<io.realm.entities.AllTypes> value);

    RealmResults<io.realm.entities.AllTypes> realmGet$parentObjects();
}

@SuppressWarnings("all")
public class AllTypesRealmProxy extends io.realm.entities.AllTypes
        implements RealmObjectProxy, AllTypesRealmProxyInterface {

    static final class AllTypesColumnInfo extends ColumnInfo {
        long columnStringIndex;
        long columnLongIndex;
        long columnFloatIndex;
        long columnDoubleIndex;
        long columnBooleanIndex;
        long columnDateIndex;
        long columnBinaryIndex;
        long columnCounterIndex;
        long columnObjectIndex;
        long columnRealmListIndex;

        AllTypesColumnInfo(SharedRealm realm, Table table) {
            super(10);
            this.columnStringIndex = addColumnDetails(table, "columnString", RealmFieldType.STRING);
            this.columnLongIndex = addColumnDetails(table, "columnLong", RealmFieldType.INTEGER);
            this.columnFloatIndex = addColumnDetails(table, "columnFloat", RealmFieldType.FLOAT);
            this.columnDoubleIndex = addColumnDetails(table, "columnDouble", RealmFieldType.DOUBLE);
            this.columnBooleanIndex = addColumnDetails(table, "columnBoolean", RealmFieldType.BOOLEAN);
            this.columnDateIndex = addColumnDetails(table, "columnDate", RealmFieldType.DATE);
            this.columnBinaryIndex = addColumnDetails(table, "columnBinary", RealmFieldType.BINARY);
            this.columnCounterIndex = addColumnDetails(table, "columnCounter", RealmFieldType.INTEGER);
            this.columnObjectIndex = addColumnDetails(table, "columnObject", RealmFieldType.OBJECT);
            this.columnRealmListIndex = addColumnDetails(table, "columnRealmList", RealmFieldType.LIST);
            addBacklinkDetails(realm, "parentObjects", "AllTypes", "columnObject");
        }

        AllTypesColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new AllTypesColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final AllTypesColumnInfo src = (AllTypesColumnInfo) rawSrc;
            final AllTypesColumnInfo dst = (AllTypesColumnInfo) rawDst;
            dst.columnStringIndex = src.columnStringIndex;
            dst.columnLongIndex = src.columnLongIndex;
            dst.columnFloatIndex = src.columnFloatIndex;
            dst.columnDoubleIndex = src.columnDoubleIndex;
            dst.columnBooleanIndex = src.columnBooleanIndex;
            dst.columnDateIndex = src.columnDateIndex;
            dst.columnBinaryIndex = src.columnBinaryIndex;
            dst.columnCounterIndex = src.columnCounterIndex;
            dst.columnObjectIndex = src.columnObjectIndex;
            dst.columnRealmListIndex = src.columnRealmListIndex;
        }
    }

    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("columnString");
        fieldNames.add("columnLong");
        fieldNames.add("columnFloat");
        fieldNames.add("columnDouble");
        fieldNames.add("columnBoolean");
        fieldNames.add("columnDate");
        fieldNames.add("columnBinary");
        fieldNames.add("columnCounter");
        fieldNames.add("columnObject");
        fieldNames.add("columnRealmList");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    private final  MutableRealmInteger columnCounterRealmInteger = new MutableRealmInteger.ManagedMutableRealmInteger() {

    }

    private AllTypesColumnInfo columnInfo;
    private ProxyState<io.realm.entities.AllTypes> proxyState;
    private RealmList<io.realm.entities.AllTypes> columnRealmListRealmList;
    private RealmResults<io.realm.entities.AllTypes> parentObjectsBacklinks;

    AllTypesRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (AllTypesColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<io.realm.entities.AllTypes>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$columnString() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.columnStringIndex);
    }

    @Override
    public void realmSet$columnString(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'columnString' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$columnLong() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.columnLongIndex);
    }

    @Override
    public void realmSet$columnLong(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.columnLongIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.columnLongIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$columnFloat() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.columnFloatIndex);
    }

    @Override
    public void realmSet$columnFloat(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.columnFloatIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.columnFloatIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$columnDouble() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.columnDoubleIndex);
    }

    @Override
    public void realmSet$columnDouble(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.columnDoubleIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.columnDoubleIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$columnBoolean() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.columnBooleanIndex);
    }

    @Override
    public void realmSet$columnBoolean(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.columnBooleanIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.columnBooleanIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Date realmGet$columnDate() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.util.Date) proxyState.getRow$realm().getDate(columnInfo.columnDateIndex);
    }

    @Override
    public void realmSet$columnDate(Date value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'columnDate' to null.");
            }
            row.getTable().setDate(columnInfo.columnDateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'columnDate' to null.");
        }
        proxyState.getRow$realm().setDate(columnInfo.columnDateIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public byte[] realmGet$columnBinary() {
        proxyState.getRealm$realm().checkIfValid();
        return (byte[]) proxyState.getRow$realm().getBinaryByteArray(columnInfo.columnBinaryIndex);
    }

    @Override
    public void realmSet$columnBinary(byte[] value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'columnBinary' to null.");
            }
            row.getTable().setBinaryByteArray(columnInfo.columnBinaryIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'columnBinary' to null.");
        }
        proxyState.getRow$realm().setBinaryByteArray(columnInfo.columnBinaryIndex, value);
    }

    @Override
    public MutableRealmInteger realmGet$columnCounter() {
        proxyState.getRealm$realm().checkIfValid();
        return columnCounterRealmInteger;
    }

    @Override
    public io.realm.entities.AllTypes realmGet$columnObject() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.columnObjectIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(io.realm.entities.AllTypes.class, proxyState.getRow$realm().getLink(columnInfo.columnObjectIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$columnObject(io.realm.entities.AllTypes value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("columnObject")) {
                return;
            }
            if (value != null && !isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.columnObjectIndex);
                return;
            }
            if (!isValid(value)) {
                throw new IllegalArgumentException("'value' is not a valid managed object.");
            }
            if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("'value' belongs to a different Realm.");
            }
            row.getTable().setLink(columnInfo.columnObjectIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.columnObjectIndex);
            return;
        }
        if (!(isManaged(value) && isValid(value))) {
            throw new IllegalArgumentException("'value' is not a valid managed object.");
        }
        if (((RealmObjectProxy) value).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
            throw new IllegalArgumentException("'value' belongs to a different Realm.");
        }
        proxyState.getRow$realm().setLink(columnInfo.columnObjectIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    public RealmList<io.realm.entities.AllTypes> realmGet$columnRealmList() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (columnRealmListRealmList != null) {
            return columnRealmListRealmList;
        } else {
            LinkView linkView = proxyState.getRow$realm().getLinkList(columnInfo.columnRealmListIndex);
            columnRealmListRealmList = new RealmList<io.realm.entities.AllTypes>(io.realm.entities.AllTypes.class, linkView, proxyState.getRealm$realm());
            return columnRealmListRealmList;
        }
    }

    @Override
    public void realmSet$columnRealmList(RealmList<io.realm.entities.AllTypes> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("columnRealmList")) {
                return;
            }
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<io.realm.entities.AllTypes> original = value;
                value = new RealmList<io.realm.entities.AllTypes>();
                for (io.realm.entities.AllTypes item : original) {
                    if (item == null || isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        LinkView links = proxyState.getRow$realm().getLinkList(columnInfo.columnRealmListIndex);
        links.clear();
        if (value == null) {
            return;
        }
        for (RealmModel linkedObject : (RealmList<? extends RealmModel>) value) {
            if (!(isManaged(linkedObject) && isValid(linkedObject))) {
                throw new IllegalArgumentException("Each element of 'value' must be a valid managed object.");
            }
            if (((RealmObjectProxy) linkedObject).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("Each element of 'value' must belong to the same Realm.");
            }
            links.add(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
        }
    }

    @Override
    public RealmResults<io.realm.entities.AllTypes> realmGet$parentObjects() {
        BaseRealm realm = proxyState.getRealm$realm();
        realm.checkIfValid();
        proxyState.getRow$realm().checkIfAttached();
        if (parentObjectsBacklinks == null) {
            parentObjectsBacklinks = RealmResults.createBacklinkResults(realm, proxyState.getRow$realm(), io.realm.entities.AllTypes.class, "columnObject");
        }
        return parentObjectsBacklinks;
    }

    public static RealmObjectSchema createRealmObjectSchema(RealmSchema realmSchema) {
        if (realmSchema.contains("AllTypes")) {
            return realmSchema.get("AllTypes");
        }
        RealmObjectSchema realmObjectSchema = realmSchema.create("AllTypes");
        realmObjectSchema.add("columnString", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        realmObjectSchema.add("columnLong", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        realmObjectSchema.add("columnFloat", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        realmObjectSchema.add("columnDouble", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        realmObjectSchema.add("columnBoolean", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        realmObjectSchema.add("columnDate", RealmFieldType.DATE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        realmObjectSchema.add("columnBinary", RealmFieldType.BINARY, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        realmObjectSchema.add("columnCounter", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        if (!realmSchema.contains("AllTypes")) {
            AllTypesRealmProxy.createRealmObjectSchema(realmSchema);
        }
        realmObjectSchema.add("columnObject", RealmFieldType.OBJECT, realmSchema.get("AllTypes"));
        if (!realmSchema.contains("AllTypes")) {
            AllTypesRealmProxy.createRealmObjectSchema(realmSchema);
        }
        realmObjectSchema.add("columnRealmList", RealmFieldType.LIST, realmSchema.get("AllTypes"));
        return realmObjectSchema;
    }

    public static AllTypesColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_AllTypes")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'AllTypes' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_AllTypes");
        final long columnCount = table.getColumnCount();
        if (columnCount != 10) {
            if (columnCount < 10) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 10 but was " + columnCount);
            }
            if (allowExtraColumns) {
                RealmLog.debug("Field count is more than expected - expected 10 but was %1$d", columnCount);
            } else {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 10 but was " + columnCount);
            }
        }
        Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
        for (long i = 0; i < columnCount; i++) {
            columnTypes.put(table.getColumnName(i), table.getColumnType(i));
        }

        final AllTypesColumnInfo columnInfo = new AllTypesColumnInfo(sharedRealm, table);

        if (!table.hasPrimaryKey()) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary key not defined for field 'columnString' in existing Realm file. @PrimaryKey was added.");
        } else {
            if (table.getPrimaryKey() != columnInfo.columnStringIndex) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary Key annotation definition was changed, from field " + table.getColumnName(table.getPrimaryKey()) + " to field columnString");
            }
        }

        if (!columnTypes.containsKey("columnString")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'columnString' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("columnString") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'columnString' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.columnStringIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"@PrimaryKey field 'columnString' does not support null values in the existing Realm file. Migrate using RealmObjectSchema.setNullable(), or mark the field as @Required.");
        }
        if (!table.hasSearchIndex(table.getColumnIndex("columnString"))) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Index not defined for field 'columnString' in existing Realm file. Either set @Index or migrate using io.realm.internal.Table.removeSearchIndex().");
        }
        if (!columnTypes.containsKey("columnLong")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'columnLong' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("columnLong") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'long' for field 'columnLong' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.columnLongIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'columnLong' does support null values in the existing Realm file. Use corresponding boxed type for field 'columnLong' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("columnFloat")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'columnFloat' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("columnFloat") != RealmFieldType.FLOAT) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'float' for field 'columnFloat' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.columnFloatIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'columnFloat' does support null values in the existing Realm file. Use corresponding boxed type for field 'columnFloat' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("columnDouble")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'columnDouble' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("columnDouble") != RealmFieldType.DOUBLE) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'double' for field 'columnDouble' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.columnDoubleIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'columnDouble' does support null values in the existing Realm file. Use corresponding boxed type for field 'columnDouble' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("columnBoolean")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'columnBoolean' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("columnBoolean") != RealmFieldType.BOOLEAN) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'boolean' for field 'columnBoolean' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.columnBooleanIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'columnBoolean' does support null values in the existing Realm file. Use corresponding boxed type for field 'columnBoolean' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("columnDate")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'columnDate' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("columnDate") != RealmFieldType.DATE) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Date' for field 'columnDate' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.columnDateIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'columnDate' does support null values in the existing Realm file. Remove @Required or @PrimaryKey from field 'columnDate' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("columnBinary")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'columnBinary' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("columnBinary") != RealmFieldType.BINARY) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'byte[]' for field 'columnBinary' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.columnBinaryIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'columnBinary' does support null values in the existing Realm file. Remove @Required or @PrimaryKey from field 'columnBinary' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("columnCounter")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'columnCounter' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("columnCounter") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'RealmInteger' for field 'columnCounter' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.columnCounterIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'columnCounter' is required. Either set @Required to field 'columnCounter' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("columnObject")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'columnObject' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("columnObject") != RealmFieldType.OBJECT) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'AllTypes' for field 'columnObject'");
        }
        if (!sharedRealm.hasTable("class_AllTypes")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing class 'class_AllTypes' for field 'columnObject'");
        }
        Table table_8 = sharedRealm.getTable("class_AllTypes");
        if (!table.getLinkTarget(columnInfo.columnObjectIndex).hasSameSchema(table_8)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmObject for field 'columnObject': '" + table.getLinkTarget(columnInfo.columnObjectIndex).getName() + "' expected - was '" + table_8.getName() + "'");
        }
        if (!columnTypes.containsKey("columnRealmList")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'columnRealmList'");
        }
        if (columnTypes.get("columnRealmList") != RealmFieldType.LIST) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'AllTypes' for field 'columnRealmList'");
        }
        if (!sharedRealm.hasTable("class_AllTypes")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing class 'class_AllTypes' for field 'columnRealmList'");
        }
        Table table_9 = sharedRealm.getTable("class_AllTypes");
        if (!table.getLinkTarget(columnInfo.columnRealmListIndex).hasSameSchema(table_9)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmList type for field 'columnRealmList': '" + table.getLinkTarget(columnInfo.columnRealmListIndex).getName() + "' expected - was '" + table_9.getName() + "'");
        }

        long backlinkFieldIndex;
        Table backlinkSourceTable;
        Table backlinkTargetTable;
        RealmFieldType backlinkFieldType;
        if (!sharedRealm.hasTable("class_AllTypes")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Cannot find source class 'io.realm.entities.AllTypes' for @LinkingObjects field 'io.realm.entities.AllTypes.parentObjects'");
        }
        backlinkSourceTable = sharedRealm.getTable("class_AllTypes");
        backlinkFieldIndex = backlinkSourceTable.getColumnIndex("columnObject");
        if (backlinkFieldIndex == Table.NO_MATCH) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Cannot find source field 'io.realm.entities.AllTypes.columnObject' for @LinkingObjects field 'io.realm.entities.AllTypes.parentObjects'");
        }
        backlinkFieldType = backlinkSourceTable.getColumnType(backlinkFieldIndex);
        if ((backlinkFieldType != RealmFieldType.OBJECT) && (backlinkFieldType != RealmFieldType.LIST)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Source field 'io.realm.entities.AllTypes.columnObject' for @LinkingObjects field 'io.realm.entities.AllTypes.parentObjects' is not a RealmObject type");
        }
        backlinkTargetTable = backlinkSourceTable.getLinkTarget(backlinkFieldIndex);
        if (!table.hasSameSchema(backlinkTargetTable)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Source field 'io.realm.entities.AllTypes.columnObject' for @LinkingObjects field 'io.realm.entities.AllTypes.parentObjects' has wrong type '" + backlinkTargetTable.getName() + "'");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_AllTypes";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static io.realm.entities.AllTypes createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
            throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(2);
        io.realm.entities.AllTypes obj = null;
        if (update) {
            Table table = realm.getTable(io.realm.entities.AllTypes.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("columnString")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("columnString"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(io.realm.entities.AllTypes.class), false, Collections.<String> emptyList());
                    obj = new io.realm.AllTypesRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("columnObject")) {
                excludeFields.add("columnObject");
            }
            if (json.has("columnRealmList")) {
                excludeFields.add("columnRealmList");
            }
            if (json.has("columnString")) {
                if (json.isNull("columnString")) {
                    obj = (io.realm.AllTypesRealmProxy) realm.createObjectInternal(io.realm.entities.AllTypes.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.AllTypesRealmProxy) realm.createObjectInternal(io.realm.entities.AllTypes.class, json.getString("columnString"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'columnString'.");
            }
        }
        if (json.has("columnLong")) {
            if (json.isNull("columnLong")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'columnLong' to null.");
            } else {
                ((AllTypesRealmProxyInterface) obj).realmSet$columnLong((long) json.getLong("columnLong"));
            }
        }
        if (json.has("columnFloat")) {
            if (json.isNull("columnFloat")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'columnFloat' to null.");
            } else {
                ((AllTypesRealmProxyInterface) obj).realmSet$columnFloat((float) json.getDouble("columnFloat"));
            }
        }
        if (json.has("columnDouble")) {
            if (json.isNull("columnDouble")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'columnDouble' to null.");
            } else {
                ((AllTypesRealmProxyInterface) obj).realmSet$columnDouble((double) json.getDouble("columnDouble"));
            }
        }
        if (json.has("columnBoolean")) {
            if (json.isNull("columnBoolean")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'columnBoolean' to null.");
            } else {
                ((AllTypesRealmProxyInterface) obj).realmSet$columnBoolean((boolean) json.getBoolean("columnBoolean"));
            }
        }
        if (json.has("columnDate")) {
            if (json.isNull("columnDate")) {
                ((AllTypesRealmProxyInterface) obj).realmSet$columnDate(null);
            } else {
                Object timestamp = json.get("columnDate");
                if (timestamp instanceof String) {
                    ((AllTypesRealmProxyInterface) obj).realmSet$columnDate(JsonUtils.stringToDate((String) timestamp));
                } else {
                    ((AllTypesRealmProxyInterface) obj).realmSet$columnDate(new Date(json.getLong("columnDate")));
                }
            }
        }
        if (json.has("columnBinary")) {
            if (json.isNull("columnBinary")) {
                ((AllTypesRealmProxyInterface) obj).realmSet$columnBinary(null);
            } else {
                ((AllTypesRealmProxyInterface) obj).realmSet$columnBinary(JsonUtils.stringToBytes(json.getString("columnBinary")));
            }
        }
        if (json.has("columnCounter")) {
            if (json.isNull("columnCounter")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'columnCounter' to null.");
            } else {
                ((AllTypesRealmProxyInterface) obj).realmGet$columnCounter().set(json.getLong("columnCounter"));
            }
        }
        if (json.has("columnObject")) {
            if (json.isNull("columnObject")) {
                ((AllTypesRealmProxyInterface) obj).realmSet$columnObject(null);
            } else {
                io.realm.entities.AllTypes columnObjectObj = AllTypesRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("columnObject"), update);
                ((AllTypesRealmProxyInterface) obj).realmSet$columnObject(columnObjectObj);
            }
        }
        if (json.has("columnRealmList")) {
            if (json.isNull("columnRealmList")) {
                ((AllTypesRealmProxyInterface) obj).realmSet$columnRealmList(null);
            } else {
                ((AllTypesRealmProxyInterface) obj).realmGet$columnRealmList().clear();
                JSONArray array = json.getJSONArray("columnRealmList");
                for (int i = 0; i < array.length(); i++) {
                    io.realm.entities.AllTypes item = AllTypesRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    ((AllTypesRealmProxyInterface) obj).realmGet$columnRealmList().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static io.realm.entities.AllTypes createUsingJsonStream(Realm realm, JsonReader reader)
            throws IOException {
        boolean jsonHasPrimaryKey = false;
        io.realm.entities.AllTypes obj = new io.realm.entities.AllTypes();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("columnString")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((AllTypesRealmProxyInterface) obj).realmSet$columnString(null);
                } else {
                    ((AllTypesRealmProxyInterface) obj).realmSet$columnString((String) reader.nextString());
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("columnLong")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'columnLong' to null.");
                } else {
                    ((AllTypesRealmProxyInterface) obj).realmSet$columnLong((long) reader.nextLong());
                }
            } else if (name.equals("columnFloat")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'columnFloat' to null.");
                } else {
                    ((AllTypesRealmProxyInterface) obj).realmSet$columnFloat((float) reader.nextDouble());
                }
            } else if (name.equals("columnDouble")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'columnDouble' to null.");
                } else {
                    ((AllTypesRealmProxyInterface) obj).realmSet$columnDouble((double) reader.nextDouble());
                }
            } else if (name.equals("columnBoolean")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'columnBoolean' to null.");
                } else {
                    ((AllTypesRealmProxyInterface) obj).realmSet$columnBoolean((boolean) reader.nextBoolean());
                }
            } else if (name.equals("columnDate")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((AllTypesRealmProxyInterface) obj).realmSet$columnDate(null);
                } else if (reader.peek() == JsonToken.NUMBER) {
                    long timestamp = reader.nextLong();
                    if (timestamp > -1) {
                        ((AllTypesRealmProxyInterface) obj).realmSet$columnDate(new Date(timestamp));
                    }
                } else {
                    ((AllTypesRealmProxyInterface) obj).realmSet$columnDate(JsonUtils.stringToDate(reader.nextString()));
                }
            } else if (name.equals("columnBinary")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((AllTypesRealmProxyInterface) obj).realmSet$columnBinary(null);
                } else {
                    ((AllTypesRealmProxyInterface) obj).realmSet$columnBinary(JsonUtils.stringToBytes(reader.nextString()));
                }
            } else if (name.equals("columnCounter")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((AllTypesRealmProxyInterface) obj).realmGet$columnCounter().set(null);
                } else {
                    ((AllTypesRealmProxyInterface) obj).realmGet$columnCounter().set((long) reader.nextLong());
                }
            } else if (name.equals("columnObject")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((AllTypesRealmProxyInterface) obj).realmSet$columnObject(null);
                } else {
                    io.realm.entities.AllTypes columnObjectObj = AllTypesRealmProxy.createUsingJsonStream(realm, reader);
                    ((AllTypesRealmProxyInterface) obj).realmSet$columnObject(columnObjectObj);
                }
            } else if (name.equals("columnRealmList")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((AllTypesRealmProxyInterface) obj).realmSet$columnRealmList(null);
                } else {
                    ((AllTypesRealmProxyInterface) obj).realmSet$columnRealmList(new RealmList<io.realm.entities.AllTypes>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        io.realm.entities.AllTypes item = AllTypesRealmProxy.createUsingJsonStream(realm, reader);
                        ((AllTypesRealmProxyInterface) obj).realmGet$columnRealmList().add(item);
                    }
                    reader.endArray();
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'columnString'.");
        }
        obj = realm.copyToRealm(obj);
        return obj;
    }

    public static io.realm.entities.AllTypes copyOrUpdate(Realm realm, io.realm.entities.AllTypes object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (io.realm.entities.AllTypes) cachedRealmObject;
        }

        io.realm.entities.AllTypes realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(io.realm.entities.AllTypes.class);
            long pkColumnIndex = table.getPrimaryKey();
            String value = ((AllTypesRealmProxyInterface) object).realmGet$columnString();
            long rowIndex = Table.NO_MATCH;
            if (value == null) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, value);
            }
            if (rowIndex != Table.NO_MATCH) {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(io.realm.entities.AllTypes.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.AllTypesRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            } else {
                canUpdate = false;
            }
        }

        if (canUpdate) {
            return update(realm, realmObject, object, cache);
        } else {
            return copy(realm, object, update, cache);
        }
    }

    public static io.realm.entities.AllTypes copy(Realm realm, io.realm.entities.AllTypes newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (io.realm.entities.AllTypes) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        io.realm.entities.AllTypes realmObject = realm.createObjectInternal(io.realm.entities.AllTypes.class, ((AllTypesRealmProxyInterface) newObject).realmGet$columnString(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        AllTypesRealmProxyInterface realmObjectSource = (AllTypesRealmProxyInterface) newObject;
        AllTypesRealmProxyInterface realmObjectCopy = (AllTypesRealmProxyInterface) realmObject;

        ProxyState<io.realm.entities.AllTypes> proxyState = ((RealmObjectProxy) realmObject).realmGet$proxyState();

        realmObjectCopy.realmSet$columnLong(realmObjectSource.realmGet$columnLong());
        realmObjectCopy.realmSet$columnFloat(realmObjectSource.realmGet$columnFloat());
        realmObjectCopy.realmSet$columnDouble(realmObjectSource.realmGet$columnDouble());
        realmObjectCopy.realmSet$columnBoolean(realmObjectSource.realmGet$columnBoolean());
        realmObjectCopy.realmSet$columnDate(realmObjectSource.realmGet$columnDate());
        realmObjectCopy.realmSet$columnBinary(realmObjectSource.realmGet$columnBinary());

        realmObjectCopy.realmGet$columnCounter().set(realmObjectSource.realmGet$columnCounter().get());

        io.realm.entities.AllTypes columnObjectObj = realmObjectSource.realmGet$columnObject();
        if (columnObjectObj == null) {
            realmObjectCopy.realmSet$columnObject(null);
        } else {
            io.realm.entities.AllTypes cachecolumnObject = (io.realm.entities.AllTypes) cache.get(columnObjectObj);
            if (cachecolumnObject != null) {
                realmObjectCopy.realmSet$columnObject(cachecolumnObject);
            } else {
                realmObjectCopy.realmSet$columnObject(AllTypesRealmProxy.copyOrUpdate(realm, columnObjectObj, update, cache));
            }
        }

        RealmList<io.realm.entities.AllTypes> columnRealmListList = realmObjectSource.realmGet$columnRealmList();
        if (columnRealmListList != null) {
            RealmList<io.realm.entities.AllTypes> columnRealmListRealmList = realmObjectCopy.realmGet$columnRealmList();
            for (int i = 0; i < columnRealmListList.size(); i++) {
                io.realm.entities.AllTypes columnRealmListItem = columnRealmListList.get(i);
                io.realm.entities.AllTypes cachecolumnRealmList = (io.realm.entities.AllTypes) cache.get(columnRealmListItem);
                if (cachecolumnRealmList != null) {
                    columnRealmListRealmList.add(cachecolumnRealmList);
                } else {
                    columnRealmListRealmList.add(AllTypesRealmProxy.copyOrUpdate(realm, columnRealmListItem, update, cache));
                }
            }
        }

        return realmObject;
    }

    public static long insert(Realm realm, io.realm.entities.AllTypes object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(io.realm.entities.AllTypes.class);
        long tableNativePtr = table.getNativePtr();
        AllTypesColumnInfo columnInfo = (AllTypesColumnInfo) realm.schema.getColumnInfo(io.realm.entities.AllTypes.class);
        long pkColumnIndex = table.getPrimaryKey();
        String primaryKeyValue = ((AllTypesRealmProxyInterface) object).realmGet$columnString();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(realm.sharedRealm, table, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.columnLongIndex, rowIndex, ((AllTypesRealmProxyInterface) object).realmGet$columnLong(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.columnFloatIndex, rowIndex, ((AllTypesRealmProxyInterface) object).realmGet$columnFloat(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.columnDoubleIndex, rowIndex, ((AllTypesRealmProxyInterface) object).realmGet$columnDouble(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.columnBooleanIndex, rowIndex, ((AllTypesRealmProxyInterface) object).realmGet$columnBoolean(), false);
        java.util.Date realmGet$columnDate = ((AllTypesRealmProxyInterface) object).realmGet$columnDate();
        if (realmGet$columnDate != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.columnDateIndex, rowIndex, realmGet$columnDate.getTime(), false);
        }
        byte[] realmGet$columnBinary = ((AllTypesRealmProxyInterface) object).realmGet$columnBinary();
        if (realmGet$columnBinary != null) {
            Table.nativeSetByteArray(tableNativePtr, columnInfo.columnBinaryIndex, rowIndex, realmGet$columnBinary, false);
        }
        io.realm.MutableRealmInteger realmGet$columnCounter = ((AllTypesRealmProxyInterface) object).realmGet$columnCounter();
        if (realmGet$columnCounter != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.columnCounterIndex, rowIndex, realmGet$columnCounter.get(), false);
        }

        io.realm.entities.AllTypes columnObjectObj = ((AllTypesRealmProxyInterface) object).realmGet$columnObject();
        if (columnObjectObj != null) {
            Long cachecolumnObject = cache.get(columnObjectObj);
            if (cachecolumnObject == null) {
                cachecolumnObject = AllTypesRealmProxy.insert(realm, columnObjectObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.columnObjectIndex, rowIndex, cachecolumnObject, false);
        }

        RealmList<io.realm.entities.AllTypes> columnRealmListList = ((AllTypesRealmProxyInterface) object).realmGet$columnRealmList();
        if (columnRealmListList != null) {
            long columnRealmListNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.columnRealmListIndex, rowIndex);
            for (io.realm.entities.AllTypes columnRealmListItem : columnRealmListList) {
                Long cacheItemIndexcolumnRealmList = cache.get(columnRealmListItem);
                if (cacheItemIndexcolumnRealmList == null) {
                    cacheItemIndexcolumnRealmList = AllTypesRealmProxy.insert(realm, columnRealmListItem, cache);
                }
                LinkView.nativeAdd(columnRealmListNativeLinkViewPtr, cacheItemIndexcolumnRealmList);
            }
        }

        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(io.realm.entities.AllTypes.class);
        long tableNativePtr = table.getNativePtr();
        AllTypesColumnInfo columnInfo = (AllTypesColumnInfo) realm.schema.getColumnInfo(io.realm.entities.AllTypes.class);
        long pkColumnIndex = table.getPrimaryKey();
        io.realm.entities.AllTypes object = null;
        while (objects.hasNext()) {
            object = (io.realm.entities.AllTypes) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((AllTypesRealmProxyInterface) object).realmGet$columnString();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(realm.sharedRealm, table, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.columnLongIndex, rowIndex, ((AllTypesRealmProxyInterface) object).realmGet$columnLong(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.columnFloatIndex, rowIndex, ((AllTypesRealmProxyInterface) object).realmGet$columnFloat(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.columnDoubleIndex, rowIndex, ((AllTypesRealmProxyInterface) object).realmGet$columnDouble(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.columnBooleanIndex, rowIndex, ((AllTypesRealmProxyInterface) object).realmGet$columnBoolean(), false);
            java.util.Date realmGet$columnDate = ((AllTypesRealmProxyInterface) object).realmGet$columnDate();
            if (realmGet$columnDate != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.columnDateIndex, rowIndex, realmGet$columnDate.getTime(), false);
            }
            byte[] realmGet$columnBinary = ((AllTypesRealmProxyInterface) object).realmGet$columnBinary();
            if (realmGet$columnBinary != null) {
                Table.nativeSetByteArray(tableNativePtr, columnInfo.columnBinaryIndex, rowIndex, realmGet$columnBinary, false);
            }
            io.realm.MutableRealmInteger realmGet$columnCounter = ((AllTypesRealmProxyInterface) object).realmGet$columnCounter();
            if (realmGet$columnCounter != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.columnCounterIndex, rowIndex, realmGet$columnCounter.get(), false);
            }
            io.realm.entities.AllTypes columnObjectObj = ((AllTypesRealmProxyInterface) object).realmGet$columnObject();
            if (columnObjectObj != null) {
                Long cachecolumnObject = cache.get(columnObjectObj);
                if (cachecolumnObject == null) {
                    cachecolumnObject = AllTypesRealmProxy.insert(realm, columnObjectObj, cache);
                }
                table.setLink(columnInfo.columnObjectIndex, rowIndex, cachecolumnObject, false);
            }

            RealmList<io.realm.entities.AllTypes> columnRealmListList = ((AllTypesRealmProxyInterface) object).realmGet$columnRealmList();
            if (columnRealmListList != null) {
                long columnRealmListNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.columnRealmListIndex, rowIndex);
                for (io.realm.entities.AllTypes columnRealmListItem : columnRealmListList) {
                    Long cacheItemIndexcolumnRealmList = cache.get(columnRealmListItem);
                    if (cacheItemIndexcolumnRealmList == null) {
                        cacheItemIndexcolumnRealmList = AllTypesRealmProxy.insert(realm, columnRealmListItem, cache);
                    }
                    LinkView.nativeAdd(columnRealmListNativeLinkViewPtr, cacheItemIndexcolumnRealmList);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, io.realm.entities.AllTypes object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(io.realm.entities.AllTypes.class);
        long tableNativePtr = table.getNativePtr();
        AllTypesColumnInfo columnInfo = (AllTypesColumnInfo) realm.schema.getColumnInfo(io.realm.entities.AllTypes.class);
        long pkColumnIndex = table.getPrimaryKey();
        String primaryKeyValue = ((AllTypesRealmProxyInterface) object).realmGet$columnString();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(realm.sharedRealm, table, primaryKeyValue);
        }
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.columnLongIndex, rowIndex, ((AllTypesRealmProxyInterface) object).realmGet$columnLong(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.columnFloatIndex, rowIndex, ((AllTypesRealmProxyInterface) object).realmGet$columnFloat(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.columnDoubleIndex, rowIndex, ((AllTypesRealmProxyInterface) object).realmGet$columnDouble(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.columnBooleanIndex, rowIndex, ((AllTypesRealmProxyInterface) object).realmGet$columnBoolean(), false);
        java.util.Date realmGet$columnDate = ((AllTypesRealmProxyInterface) object).realmGet$columnDate();
        if (realmGet$columnDate != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.columnDateIndex, rowIndex, realmGet$columnDate.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.columnDateIndex, rowIndex, false);
        }
        byte[] realmGet$columnBinary = ((AllTypesRealmProxyInterface) object).realmGet$columnBinary();
        if (realmGet$columnBinary != null) {
            Table.nativeSetByteArray(tableNativePtr, columnInfo.columnBinaryIndex, rowIndex, realmGet$columnBinary, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.columnBinaryIndex, rowIndex, false);
        }
        io.realm.MutableRealmInteger realmGet$columnCounter = ((AllTypesRealmProxyInterface) object).realmGet$columnCounter();
        if (realmGet$columnCounter != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.columnCounterIndex, rowIndex, realmGet$columnCounter.get(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.columnCounterIndex, rowIndex, false);
        }

        io.realm.entities.AllTypes columnObjectObj = ((AllTypesRealmProxyInterface) object).realmGet$columnObject();
        if (columnObjectObj != null) {
            Long cachecolumnObject = cache.get(columnObjectObj);
            if (cachecolumnObject == null) {
                cachecolumnObject = AllTypesRealmProxy.insertOrUpdate(realm, columnObjectObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.columnObjectIndex, rowIndex, cachecolumnObject, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.columnObjectIndex, rowIndex);
        }

        long columnRealmListNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.columnRealmListIndex, rowIndex);
        LinkView.nativeClear(columnRealmListNativeLinkViewPtr);
        RealmList<io.realm.entities.AllTypes> columnRealmListList = ((AllTypesRealmProxyInterface) object).realmGet$columnRealmList();
        if (columnRealmListList != null) {
            for (io.realm.entities.AllTypes columnRealmListItem : columnRealmListList) {
                Long cacheItemIndexcolumnRealmList = cache.get(columnRealmListItem);
                if (cacheItemIndexcolumnRealmList == null) {
                    cacheItemIndexcolumnRealmList = AllTypesRealmProxy.insertOrUpdate(realm, columnRealmListItem, cache);
                }
                LinkView.nativeAdd(columnRealmListNativeLinkViewPtr, cacheItemIndexcolumnRealmList);
            }
        }

        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(io.realm.entities.AllTypes.class);
        long tableNativePtr = table.getNativePtr();
        AllTypesColumnInfo columnInfo = (AllTypesColumnInfo) realm.schema.getColumnInfo(io.realm.entities.AllTypes.class);
        long pkColumnIndex = table.getPrimaryKey();
        io.realm.entities.AllTypes object = null;
        while (objects.hasNext()) {
            object = (io.realm.entities.AllTypes) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((AllTypesRealmProxyInterface) object).realmGet$columnString();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(realm.sharedRealm, table, primaryKeyValue);
            }
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.columnLongIndex, rowIndex, ((AllTypesRealmProxyInterface) object).realmGet$columnLong(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.columnFloatIndex, rowIndex, ((AllTypesRealmProxyInterface) object).realmGet$columnFloat(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.columnDoubleIndex, rowIndex, ((AllTypesRealmProxyInterface) object).realmGet$columnDouble(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.columnBooleanIndex, rowIndex, ((AllTypesRealmProxyInterface) object).realmGet$columnBoolean(), false);
            java.util.Date realmGet$columnDate = ((AllTypesRealmProxyInterface) object).realmGet$columnDate();
            if (realmGet$columnDate != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.columnDateIndex, rowIndex, realmGet$columnDate.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.columnDateIndex, rowIndex, false);
            }
            byte[] realmGet$columnBinary = ((AllTypesRealmProxyInterface) object).realmGet$columnBinary();
            if (realmGet$columnBinary != null) {
                Table.nativeSetByteArray(tableNativePtr, columnInfo.columnBinaryIndex, rowIndex, realmGet$columnBinary, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.columnBinaryIndex, rowIndex, false);
            }
            io.realm.MutableRealmInteger realmGet$columnCounter = ((AllTypesRealmProxyInterface) object).realmGet$columnCounter();
            if (realmGet$columnCounter != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.columnCounterIndex, rowIndex, realmGet$columnCounter.get(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.columnCounterIndex, rowIndex, false);
            }

            io.realm.entities.AllTypes columnObjectObj = ((AllTypesRealmProxyInterface) object).realmGet$columnObject();
            if (columnObjectObj != null) {
                Long cachecolumnObject = cache.get(columnObjectObj);
                if (cachecolumnObject == null) {
                    cachecolumnObject = AllTypesRealmProxy.insertOrUpdate(realm, columnObjectObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.columnObjectIndex, rowIndex, cachecolumnObject, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.columnObjectIndex, rowIndex);
            }

            long columnRealmListNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.columnRealmListIndex, rowIndex);
            LinkView.nativeClear(columnRealmListNativeLinkViewPtr);
            RealmList<io.realm.entities.AllTypes> columnRealmListList = ((AllTypesRealmProxyInterface) object).realmGet$columnRealmList();
            if (columnRealmListList != null) {
                for (io.realm.entities.AllTypes columnRealmListItem : columnRealmListList) {
                    Long cacheItemIndexcolumnRealmList = cache.get(columnRealmListItem);
                    if (cacheItemIndexcolumnRealmList == null) {
                        cacheItemIndexcolumnRealmList = AllTypesRealmProxy.insertOrUpdate(realm, columnRealmListItem, cache);
                    }
                    LinkView.nativeAdd(columnRealmListNativeLinkViewPtr, cacheItemIndexcolumnRealmList);
                }
            }

        }
    }

    public static io.realm.entities.AllTypes createDetachedCopy(io.realm.entities.AllTypes realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        io.realm.entities.AllTypes unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new io.realm.entities.AllTypes();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (io.realm.entities.AllTypes) cachedObject.object;
            }
            unmanagedObject = (io.realm.entities.AllTypes) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        AllTypesRealmProxyInterface unmanagedCopy = (AllTypesRealmProxyInterface) unmanagedObject;
        AllTypesRealmProxyInterface realmSource = (AllTypesRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$columnString(realmSource.realmGet$columnString());
        unmanagedCopy.realmSet$columnLong(realmSource.realmGet$columnLong());
        unmanagedCopy.realmSet$columnFloat(realmSource.realmGet$columnFloat());
        unmanagedCopy.realmSet$columnDouble(realmSource.realmGet$columnDouble());
        unmanagedCopy.realmSet$columnBoolean(realmSource.realmGet$columnBoolean());
        unmanagedCopy.realmSet$columnDate(realmSource.realmGet$columnDate());
        unmanagedCopy.realmSet$columnBinary(realmSource.realmGet$columnBinary());
        unmanagedCopy.realmGet$columnCounter().set(realmSource.realmGet$columnCounter().get());

        // Deep copy of columnObject
        unmanagedCopy.realmSet$columnObject(AllTypesRealmProxy.createDetachedCopy(realmSource.realmGet$columnObject(), currentDepth + 1, maxDepth, cache));

        // Deep copy of columnRealmList
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$columnRealmList(null);
        } else {
            RealmList<io.realm.entities.AllTypes> managedcolumnRealmListList = realmSource.realmGet$columnRealmList();
            RealmList<io.realm.entities.AllTypes> unmanagedcolumnRealmListList = new RealmList<io.realm.entities.AllTypes>();
            unmanagedCopy.realmSet$columnRealmList(unmanagedcolumnRealmListList);
            int nextDepth = currentDepth + 1;
            int size = managedcolumnRealmListList.size();
            for (int i = 0; i < size; i++) {
                io.realm.entities.AllTypes item = AllTypesRealmProxy.createDetachedCopy(managedcolumnRealmListList.get(i), nextDepth, maxDepth, cache);
                unmanagedcolumnRealmListList.add(item);
            }
        }
        return unmanagedObject;
    }

    static io.realm.entities.AllTypes update(Realm realm, io.realm.entities.AllTypes realmObject, io.realm.entities.AllTypes newObject, Map<RealmModel, RealmObjectProxy> cache) {
        AllTypesRealmProxyInterface realmObjectTarget = (AllTypesRealmProxyInterface) realmObject;
        AllTypesRealmProxyInterface realmObjectSource = (AllTypesRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$columnLong(realmObjectSource.realmGet$columnLong());
        realmObjectTarget.realmSet$columnFloat(realmObjectSource.realmGet$columnFloat());
        realmObjectTarget.realmSet$columnDouble(realmObjectSource.realmGet$columnDouble());
        realmObjectTarget.realmSet$columnBoolean(realmObjectSource.realmGet$columnBoolean());
        realmObjectTarget.realmSet$columnDate(realmObjectSource.realmGet$columnDate());
        realmObjectTarget.realmSet$columnBinary(realmObjectSource.realmGet$columnBinary());
        realmObjectTarget.realmGet$columnCounter().set(realmObjectSource.realmGet$columnCounter().get());
        io.realm.entities.AllTypes columnObjectObj = realmObjectSource.realmGet$columnObject();
        if (columnObjectObj == null) {
            realmObjectTarget.realmSet$columnObject(null);
        } else {
            io.realm.entities.AllTypes cachecolumnObject = (io.realm.entities.AllTypes) cache.get(columnObjectObj);
            if (cachecolumnObject != null) {
                realmObjectTarget.realmSet$columnObject(cachecolumnObject);
            } else {
                realmObjectTarget.realmSet$columnObject(AllTypesRealmProxy.copyOrUpdate(realm, columnObjectObj, true, cache));
            }
        }
        RealmList<io.realm.entities.AllTypes> columnRealmListList = realmObjectSource.realmGet$columnRealmList();
        RealmList<io.realm.entities.AllTypes> columnRealmListRealmList = realmObjectTarget.realmGet$columnRealmList();
        columnRealmListRealmList.clear();
        if (columnRealmListList != null) {
            for (int i = 0; i < columnRealmListList.size(); i++) {
                io.realm.entities.AllTypes columnRealmListItem = columnRealmListList.get(i);
                io.realm.entities.AllTypes cachecolumnRealmList = (io.realm.entities.AllTypes) cache.get(columnRealmListItem);
                if (cachecolumnRealmList != null) {
                    columnRealmListRealmList.add(cachecolumnRealmList);
                } else {
                    columnRealmListRealmList.add(AllTypesRealmProxy.copyOrUpdate(realm, columnRealmListItem, true, cache));
                }
            }
        }
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("AllTypes = proxy[");
        stringBuilder.append("{columnString:");
        stringBuilder.append(realmGet$columnString() != null ? realmGet$columnString() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{columnLong:");
        stringBuilder.append(realmGet$columnLong());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{columnFloat:");
        stringBuilder.append(realmGet$columnFloat());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{columnDouble:");
        stringBuilder.append(realmGet$columnDouble());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{columnBoolean:");
        stringBuilder.append(realmGet$columnBoolean());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{columnDate:");
        stringBuilder.append(realmGet$columnDate());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{columnBinary:");
        stringBuilder.append(realmGet$columnBinary());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{columnCounter:");
        stringBuilder.append(realmGet$columnCounter().get());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{columnObject:");
        stringBuilder.append(realmGet$columnObject() != null ? "AllTypes" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{columnRealmList:");
        stringBuilder.append("RealmList<AllTypes>[").append(realmGet$columnRealmList().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllTypesRealmProxy aAllTypes = (AllTypesRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aAllTypes.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aAllTypes.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aAllTypes.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
