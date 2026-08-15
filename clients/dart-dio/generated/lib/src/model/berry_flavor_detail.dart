//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/berry_flavor_name.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/contest_type_summary.dart';
import 'package:openapi/src/model/berry_flavor_detail_berries_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'berry_flavor_detail.g.dart';

/// BerryFlavorDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [berries] 
/// * [contestType] 
/// * [names] 
@BuiltValue()
abstract class BerryFlavorDetail implements Built<BerryFlavorDetail, BerryFlavorDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'berries')
  BuiltList<BerryFlavorDetailBerriesInner> get berries;

  @BuiltValueField(wireName: r'contest_type')
  ContestTypeSummary get contestType;

  @BuiltValueField(wireName: r'names')
  BuiltList<BerryFlavorName> get names;

  BerryFlavorDetail._();

  factory BerryFlavorDetail([void updates(BerryFlavorDetailBuilder b)]) = _$BerryFlavorDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BerryFlavorDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BerryFlavorDetail> get serializer => _$BerryFlavorDetailSerializer();
}

class _$BerryFlavorDetailSerializer implements PrimitiveSerializer<BerryFlavorDetail> {
  @override
  final Iterable<Type> types = const [BerryFlavorDetail, _$BerryFlavorDetail];

  @override
  final String wireName = r'BerryFlavorDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BerryFlavorDetail object, {
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
    yield r'berries';
    yield serializers.serialize(
      object.berries,
      specifiedType: const FullType(BuiltList, [FullType(BerryFlavorDetailBerriesInner)]),
    );
    yield r'contest_type';
    yield serializers.serialize(
      object.contestType,
      specifiedType: const FullType(ContestTypeSummary),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(BerryFlavorName)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    BerryFlavorDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BerryFlavorDetailBuilder result,
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
        case r'berries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(BerryFlavorDetailBerriesInner)]),
          ) as BuiltList<BerryFlavorDetailBerriesInner>;
          result.berries.replace(valueDes);
          break;
        case r'contest_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ContestTypeSummary),
          ) as ContestTypeSummary;
          result.contestType.replace(valueDes);
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(BerryFlavorName)]),
          ) as BuiltList<BerryFlavorName>;
          result.names.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BerryFlavorDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BerryFlavorDetailBuilder();
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

