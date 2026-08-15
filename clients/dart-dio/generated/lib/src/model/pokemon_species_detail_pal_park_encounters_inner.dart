//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_species_detail_pal_park_encounters_inner.g.dart';

/// PokemonSpeciesDetailPalParkEncountersInner
///
/// Properties:
/// * [area] 
/// * [baseScore] 
/// * [rate] 
@BuiltValue()
abstract class PokemonSpeciesDetailPalParkEncountersInner implements Built<PokemonSpeciesDetailPalParkEncountersInner, PokemonSpeciesDetailPalParkEncountersInnerBuilder> {
  @BuiltValueField(wireName: r'area')
  AbilityDetailPokemonInnerPokemon get area;

  @BuiltValueField(wireName: r'base_score')
  int get baseScore;

  @BuiltValueField(wireName: r'rate')
  int get rate;

  PokemonSpeciesDetailPalParkEncountersInner._();

  factory PokemonSpeciesDetailPalParkEncountersInner([void updates(PokemonSpeciesDetailPalParkEncountersInnerBuilder b)]) = _$PokemonSpeciesDetailPalParkEncountersInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonSpeciesDetailPalParkEncountersInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonSpeciesDetailPalParkEncountersInner> get serializer => _$PokemonSpeciesDetailPalParkEncountersInnerSerializer();
}

class _$PokemonSpeciesDetailPalParkEncountersInnerSerializer implements PrimitiveSerializer<PokemonSpeciesDetailPalParkEncountersInner> {
  @override
  final Iterable<Type> types = const [PokemonSpeciesDetailPalParkEncountersInner, _$PokemonSpeciesDetailPalParkEncountersInner];

  @override
  final String wireName = r'PokemonSpeciesDetailPalParkEncountersInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonSpeciesDetailPalParkEncountersInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'area';
    yield serializers.serialize(
      object.area,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
    yield r'base_score';
    yield serializers.serialize(
      object.baseScore,
      specifiedType: const FullType(int),
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
    PokemonSpeciesDetailPalParkEncountersInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonSpeciesDetailPalParkEncountersInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'area':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.area.replace(valueDes);
          break;
        case r'base_score':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.baseScore = valueDes;
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
  PokemonSpeciesDetailPalParkEncountersInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonSpeciesDetailPalParkEncountersInnerBuilder();
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

