//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'stat_detail_affecting_natures.g.dart';

/// StatDetailAffectingNatures
///
/// Properties:
/// * [increase] 
/// * [decrease] 
@BuiltValue()
abstract class StatDetailAffectingNatures implements Built<StatDetailAffectingNatures, StatDetailAffectingNaturesBuilder> {
  @BuiltValueField(wireName: r'increase')
  BuiltList<AbilityDetailPokemonInnerPokemon> get increase;

  @BuiltValueField(wireName: r'decrease')
  BuiltList<AbilityDetailPokemonInnerPokemon> get decrease;

  StatDetailAffectingNatures._();

  factory StatDetailAffectingNatures([void updates(StatDetailAffectingNaturesBuilder b)]) = _$StatDetailAffectingNatures;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(StatDetailAffectingNaturesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<StatDetailAffectingNatures> get serializer => _$StatDetailAffectingNaturesSerializer();
}

class _$StatDetailAffectingNaturesSerializer implements PrimitiveSerializer<StatDetailAffectingNatures> {
  @override
  final Iterable<Type> types = const [StatDetailAffectingNatures, _$StatDetailAffectingNatures];

  @override
  final String wireName = r'StatDetailAffectingNatures';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    StatDetailAffectingNatures object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'increase';
    yield serializers.serialize(
      object.increase,
      specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
    );
    yield r'decrease';
    yield serializers.serialize(
      object.decrease,
      specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    StatDetailAffectingNatures object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required StatDetailAffectingNaturesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'increase':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
          ) as BuiltList<AbilityDetailPokemonInnerPokemon>;
          result.increase.replace(valueDes);
          break;
        case r'decrease':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
          ) as BuiltList<AbilityDetailPokemonInnerPokemon>;
          result.decrease.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  StatDetailAffectingNatures deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = StatDetailAffectingNaturesBuilder();
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

