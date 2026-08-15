//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/item_summary.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/berry_detail_flavors_inner.dart';
import 'package:openapi/src/model/type_summary.dart';
import 'package:openapi/src/model/berry_firmness_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'berry_detail.g.dart';

/// BerryDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [growthTime] 
/// * [maxHarvest] 
/// * [naturalGiftPower] 
/// * [size] 
/// * [smoothness] 
/// * [soilDryness] 
/// * [firmness] 
/// * [flavors] 
/// * [item] 
/// * [naturalGiftType] 
@BuiltValue()
abstract class BerryDetail implements Built<BerryDetail, BerryDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'growth_time')
  int get growthTime;

  @BuiltValueField(wireName: r'max_harvest')
  int get maxHarvest;

  @BuiltValueField(wireName: r'natural_gift_power')
  int get naturalGiftPower;

  @BuiltValueField(wireName: r'size')
  int get size;

  @BuiltValueField(wireName: r'smoothness')
  int get smoothness;

  @BuiltValueField(wireName: r'soil_dryness')
  int get soilDryness;

  @BuiltValueField(wireName: r'firmness')
  BerryFirmnessSummary get firmness;

  @BuiltValueField(wireName: r'flavors')
  BuiltList<BerryDetailFlavorsInner> get flavors;

  @BuiltValueField(wireName: r'item')
  ItemSummary get item;

  @BuiltValueField(wireName: r'natural_gift_type')
  TypeSummary get naturalGiftType;

  BerryDetail._();

  factory BerryDetail([void updates(BerryDetailBuilder b)]) = _$BerryDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BerryDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BerryDetail> get serializer => _$BerryDetailSerializer();
}

class _$BerryDetailSerializer implements PrimitiveSerializer<BerryDetail> {
  @override
  final Iterable<Type> types = const [BerryDetail, _$BerryDetail];

  @override
  final String wireName = r'BerryDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BerryDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(int),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'growth_time';
    yield serializers.serialize(
      object.growthTime,
      specifiedType: const FullType(int),
    );
    yield r'max_harvest';
    yield serializers.serialize(
      object.maxHarvest,
      specifiedType: const FullType(int),
    );
    yield r'natural_gift_power';
    yield serializers.serialize(
      object.naturalGiftPower,
      specifiedType: const FullType(int),
    );
    yield r'size';
    yield serializers.serialize(
      object.size,
      specifiedType: const FullType(int),
    );
    yield r'smoothness';
    yield serializers.serialize(
      object.smoothness,
      specifiedType: const FullType(int),
    );
    yield r'soil_dryness';
    yield serializers.serialize(
      object.soilDryness,
      specifiedType: const FullType(int),
    );
    yield r'firmness';
    yield serializers.serialize(
      object.firmness,
      specifiedType: const FullType(BerryFirmnessSummary),
    );
    yield r'flavors';
    yield serializers.serialize(
      object.flavors,
      specifiedType: const FullType(BuiltList, [FullType(BerryDetailFlavorsInner)]),
    );
    yield r'item';
    yield serializers.serialize(
      object.item,
      specifiedType: const FullType(ItemSummary),
    );
    yield r'natural_gift_type';
    yield serializers.serialize(
      object.naturalGiftType,
      specifiedType: const FullType(TypeSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    BerryDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BerryDetailBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.id = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'growth_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.growthTime = valueDes;
          break;
        case r'max_harvest':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.maxHarvest = valueDes;
          break;
        case r'natural_gift_power':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.naturalGiftPower = valueDes;
          break;
        case r'size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.size = valueDes;
          break;
        case r'smoothness':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.smoothness = valueDes;
          break;
        case r'soil_dryness':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.soilDryness = valueDes;
          break;
        case r'firmness':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BerryFirmnessSummary),
          ) as BerryFirmnessSummary;
          result.firmness.replace(valueDes);
          break;
        case r'flavors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(BerryDetailFlavorsInner)]),
          ) as BuiltList<BerryDetailFlavorsInner>;
          result.flavors.replace(valueDes);
          break;
        case r'item':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ItemSummary),
          ) as ItemSummary;
          result.item.replace(valueDes);
          break;
        case r'natural_gift_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TypeSummary),
          ) as TypeSummary;
          result.naturalGiftType.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BerryDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BerryDetailBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

