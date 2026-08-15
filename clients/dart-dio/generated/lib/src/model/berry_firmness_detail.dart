//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/berry_summary.dart';
import 'package:openapi/src/model/berry_firmness_name.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'berry_firmness_detail.g.dart';

/// BerryFirmnessDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [berries] 
/// * [names] 
@BuiltValue()
abstract class BerryFirmnessDetail implements Built<BerryFirmnessDetail, BerryFirmnessDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'berries')
  BuiltList<BerrySummary> get berries;

  @BuiltValueField(wireName: r'names')
  BuiltList<BerryFirmnessName> get names;

  BerryFirmnessDetail._();

  factory BerryFirmnessDetail([void updates(BerryFirmnessDetailBuilder b)]) = _$BerryFirmnessDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BerryFirmnessDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BerryFirmnessDetail> get serializer => _$BerryFirmnessDetailSerializer();
}

class _$BerryFirmnessDetailSerializer implements PrimitiveSerializer<BerryFirmnessDetail> {
  @override
  final Iterable<Type> types = const [BerryFirmnessDetail, _$BerryFirmnessDetail];

  @override
  final String wireName = r'BerryFirmnessDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BerryFirmnessDetail object, {
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
      specifiedType: const FullType(BuiltList, [FullType(BerrySummary)]),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(BerryFirmnessName)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    BerryFirmnessDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BerryFirmnessDetailBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(BerrySummary)]),
          ) as BuiltList<BerrySummary>;
          result.berries.replace(valueDes);
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(BerryFirmnessName)]),
          ) as BuiltList<BerryFirmnessName>;
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
  BerryFirmnessDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BerryFirmnessDetailBuilder();
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

