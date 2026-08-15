//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pal_park_area_detail_pokemon_encounters_inner.g.dart';

/// PalParkAreaDetailPokemonEncountersInner
///
/// Properties:
/// * [baseScore] 
/// * [pokemonSpecies] 
/// * [rate] 
@BuiltValue()
abstract class PalParkAreaDetailPokemonEncountersInner implements Built<PalParkAreaDetailPokemonEncountersInner, PalParkAreaDetailPokemonEncountersInnerBuilder> {
  @BuiltValueField(wireName: r'base_score')
  int get baseScore;

  @BuiltValueField(wireName: r'pokemon-species')
  AbilityDetailPokemonInnerPokemon get pokemonSpecies;

  @BuiltValueField(wireName: r'rate')
  int get rate;

  PalParkAreaDetailPokemonEncountersInner._();

  factory PalParkAreaDetailPokemonEncountersInner([void updates(PalParkAreaDetailPokemonEncountersInnerBuilder b)]) = _$PalParkAreaDetailPokemonEncountersInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PalParkAreaDetailPokemonEncountersInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PalParkAreaDetailPokemonEncountersInner> get serializer => _$PalParkAreaDetailPokemonEncountersInnerSerializer();
}

class _$PalParkAreaDetailPokemonEncountersInnerSerializer implements PrimitiveSerializer<PalParkAreaDetailPokemonEncountersInner> {
  @override
  final Iterable<Type> types = const [PalParkAreaDetailPokemonEncountersInner, _$PalParkAreaDetailPokemonEncountersInner];

  @override
  final String wireName = r'PalParkAreaDetailPokemonEncountersInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PalParkAreaDetailPokemonEncountersInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'base_score';
    yield serializers.serialize(
      object.baseScore,
      specifiedType: const FullType(int),
    );
    yield r'pokemon-species';
    yield serializers.serialize(
      object.pokemonSpecies,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
    yield r'rate';
    yield serializers.serialize(
      object.rate,
      specifiedType: const FullType(int),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PalParkAreaDetailPokemonEncountersInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PalParkAreaDetailPokemonEncountersInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'base_score':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.baseScore = valueDes;
          break;
        case r'pokemon-species':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.pokemonSpecies.replace(valueDes);
          break;
        case r'rate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.rate = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PalParkAreaDetailPokemonEncountersInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PalParkAreaDetailPokemonEncountersInnerBuilder();
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

