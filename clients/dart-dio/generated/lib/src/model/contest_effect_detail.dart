//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/contest_effect_flavor_text.dart';
import 'package:openapi/src/model/contest_effect_effect_text.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'contest_effect_detail.g.dart';

/// ContestEffectDetail
///
/// Properties:
/// * [id] 
/// * [appeal] 
/// * [jam] 
/// * [effectEntries] 
/// * [flavorTextEntries] 
@BuiltValue()
abstract class ContestEffectDetail implements Built<ContestEffectDetail, ContestEffectDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'appeal')
  int get appeal;

  @BuiltValueField(wireName: r'jam')
  int get jam;

  @BuiltValueField(wireName: r'effect_entries')
  BuiltList<ContestEffectEffectText> get effectEntries;

  @BuiltValueField(wireName: r'flavor_text_entries')
  BuiltList<ContestEffectFlavorText> get flavorTextEntries;

  ContestEffectDetail._();

  factory ContestEffectDetail([void updates(ContestEffectDetailBuilder b)]) = _$ContestEffectDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ContestEffectDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ContestEffectDetail> get serializer => _$ContestEffectDetailSerializer();
}

class _$ContestEffectDetailSerializer implements PrimitiveSerializer<ContestEffectDetail> {
  @override
  final Iterable<Type> types = const [ContestEffectDetail, _$ContestEffectDetail];

  @override
  final String wireName = r'ContestEffectDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ContestEffectDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(int),
    );
    yield r'appeal';
    yield serializers.serialize(
      object.appeal,
      specifiedType: const FullType(int),
    );
    yield r'jam';
    yield serializers.serialize(
      object.jam,
      specifiedType: const FullType(int),
    );
    yield r'effect_entries';
    yield serializers.serialize(
      object.effectEntries,
      specifiedType: const FullType(BuiltList, [FullType(ContestEffectEffectText)]),
    );
    yield r'flavor_text_entries';
    yield serializers.serialize(
      object.flavorTextEntries,
      specifiedType: const FullType(BuiltList, [FullType(ContestEffectFlavorText)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ContestEffectDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ContestEffectDetailBuilder result,
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
        case r'appeal':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.appeal = valueDes;
          break;
        case r'jam':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.jam = valueDes;
          break;
        case r'effect_entries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ContestEffectEffectText)]),
          ) as BuiltList<ContestEffectEffectText>;
          result.effectEntries.replace(valueDes);
          break;
        case r'flavor_text_entries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ContestEffectFlavorText)]),
          ) as BuiltList<ContestEffectFlavorText>;
          result.flavorTextEntries.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ContestEffectDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ContestEffectDetailBuilder();
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

