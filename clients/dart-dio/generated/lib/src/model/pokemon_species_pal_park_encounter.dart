//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pal_park_area_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_species_pal_park_encounter.g.dart';

/// PokemonSpeciesPalParkEncounter
///
/// Properties:
/// * [baseScore] - The base score given to the player when the referenced Pokémon is caught during a pal park run.
/// * [rate] - The base rate for encountering the referenced Pokémon in this pal park area.
/// * [area] - The pal park area where this encounter happens.
@BuiltValue()
abstract class PokemonSpeciesPalParkEncounter implements Built<PokemonSpeciesPalParkEncounter, PokemonSpeciesPalParkEncounterBuilder> {
  /// The base score given to the player when the referenced Pokémon is caught during a pal park run.
  @BuiltValueField(wireName: r'base_score')
  int? get baseScore;

  /// The base rate for encountering the referenced Pokémon in this pal park area.
  @BuiltValueField(wireName: r'rate')
  int get rate;

  /// The pal park area where this encounter happens.
  @BuiltValueField(wireName: r'area')
  PalParkAreaSummary get area;

  PokemonSpeciesPalParkEncounter._();

  factory PokemonSpeciesPalParkEncounter([void updates(PokemonSpeciesPalParkEncounterBuilder b)]) = _$PokemonSpeciesPalParkEncounter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonSpeciesPalParkEncounterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonSpeciesPalParkEncounter> get serializer => _$PokemonSpeciesPalParkEncounterSerializer();
}

class _$PokemonSpeciesPalParkEncounterSerializer implements PrimitiveSerializer<PokemonSpeciesPalParkEncounter> {
  @override
  final Iterable<Type> types = const [PokemonSpeciesPalParkEncounter, _$PokemonSpeciesPalParkEncounter];

  @override
  final String wireName = r'PokemonSpeciesPalParkEncounter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonSpeciesPalParkEncounter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.baseScore != null) {
      yield r'base_score';
      yield serializers.serialize(
        object.baseScore,
        specifiedType: const FullType.nullable(int),
      );
    }
    yield r'rate';
    yield serializers.serialize(
      object.rate,
      specifiedType: const FullType(int),
    );
    yield r'area';
    yield serializers.serialize(
      object.area,
      specifiedType: const FullType(PalParkAreaSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonSpeciesPalParkEncounter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonSpeciesPalParkEncounterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'base_score':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.baseScore = valueDes;
          break;
        case r'rate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.rate = valueDes;
          break;
        case r'area':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PalParkAreaSummary),
          ) as PalParkAreaSummary;
          result.area.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonSpeciesPalParkEncounter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonSpeciesPalParkEncounterBuilder();
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


