//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pokeathlon_stat_detail_affecting_natures_decrease_inner.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/pokeathlon_stat_detail_affecting_natures_increase_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokeathlon_stat_detail_affecting_natures.g.dart';

/// PokeathlonStatDetailAffectingNatures
///
/// Properties:
/// * [decrease] 
/// * [increase] 
@BuiltValue()
abstract class PokeathlonStatDetailAffectingNatures implements Built<PokeathlonStatDetailAffectingNatures, PokeathlonStatDetailAffectingNaturesBuilder> {
  @BuiltValueField(wireName: r'decrease')
  BuiltList<PokeathlonStatDetailAffectingNaturesDecreaseInner> get decrease;

  @BuiltValueField(wireName: r'increase')
  BuiltList<PokeathlonStatDetailAffectingNaturesIncreaseInner> get increase;

  PokeathlonStatDetailAffectingNatures._();

  factory PokeathlonStatDetailAffectingNatures([void updates(PokeathlonStatDetailAffectingNaturesBuilder b)]) = _$PokeathlonStatDetailAffectingNatures;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokeathlonStatDetailAffectingNaturesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokeathlonStatDetailAffectingNatures> get serializer => _$PokeathlonStatDetailAffectingNaturesSerializer();
}

class _$PokeathlonStatDetailAffectingNaturesSerializer implements PrimitiveSerializer<PokeathlonStatDetailAffectingNatures> {
  @override
  final Iterable<Type> types = const [PokeathlonStatDetailAffectingNatures, _$PokeathlonStatDetailAffectingNatures];

  @override
  final String wireName = r'PokeathlonStatDetailAffectingNatures';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokeathlonStatDetailAffectingNatures object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'decrease';
    yield serializers.serialize(
      object.decrease,
      specifiedType: const FullType(BuiltList, [FullType(PokeathlonStatDetailAffectingNaturesDecreaseInner)]),
    );
    yield r'increase';
    yield serializers.serialize(
      object.increase,
      specifiedType: const FullType(BuiltList, [FullType(PokeathlonStatDetailAffectingNaturesIncreaseInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokeathlonStatDetailAffectingNatures object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokeathlonStatDetailAffectingNaturesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'decrease':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokeathlonStatDetailAffectingNaturesDecreaseInner)]),
          ) as BuiltList<PokeathlonStatDetailAffectingNaturesDecreaseInner>;
          result.decrease.replace(valueDes);
          break;
        case r'increase':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokeathlonStatDetailAffectingNaturesIncreaseInner)]),
          ) as BuiltList<PokeathlonStatDetailAffectingNaturesIncreaseInner>;
          result.increase.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokeathlonStatDetailAffectingNatures deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokeathlonStatDetailAffectingNaturesBuilder();
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

