//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/pokemon_detail_abilities_inner.dart';
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_detail_past_abilities_inner.g.dart';

/// PokemonDetailPastAbilitiesInner
///
/// Properties:
/// * [abilities] 
/// * [generation] 
@BuiltValue()
abstract class PokemonDetailPastAbilitiesInner implements Built<PokemonDetailPastAbilitiesInner, PokemonDetailPastAbilitiesInnerBuilder> {
  @BuiltValueField(wireName: r'abilities')
  BuiltList<PokemonDetailAbilitiesInner> get abilities;

  @BuiltValueField(wireName: r'generation')
  AbilityDetailPokemonInnerPokemon get generation;

  PokemonDetailPastAbilitiesInner._();

  factory PokemonDetailPastAbilitiesInner([void updates(PokemonDetailPastAbilitiesInnerBuilder b)]) = _$PokemonDetailPastAbilitiesInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonDetailPastAbilitiesInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonDetailPastAbilitiesInner> get serializer => _$PokemonDetailPastAbilitiesInnerSerializer();
}

class _$PokemonDetailPastAbilitiesInnerSerializer implements PrimitiveSerializer<PokemonDetailPastAbilitiesInner> {
  @override
  final Iterable<Type> types = const [PokemonDetailPastAbilitiesInner, _$PokemonDetailPastAbilitiesInner];

  @override
  final String wireName = r'PokemonDetailPastAbilitiesInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonDetailPastAbilitiesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'abilities';
    yield serializers.serialize(
      object.abilities,
      specifiedType: const FullType(BuiltList, [FullType(PokemonDetailAbilitiesInner)]),
    );
    yield r'generation';
    yield serializers.serialize(
      object.generation,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonDetailPastAbilitiesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonDetailPastAbilitiesInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'abilities':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonDetailAbilitiesInner)]),
          ) as BuiltList<PokemonDetailAbilitiesInner>;
          result.abilities.replace(valueDes);
          break;
        case r'generation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.generation.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonDetailPastAbilitiesInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonDetailPastAbilitiesInnerBuilder();
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

