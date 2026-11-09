//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'encounter_pokemon_detail.g.dart';

/// EncounterPokemonDetail
///
/// Properties:
/// * [minPerfectIvs] - The minimum number of perfect IVs, or null if unspecified.
/// * [alwaysShiny] - Whether the encountered Pokémon is always shiny.
/// * [neverShiny] - Whether the encountered Pokémon can never be shiny.
/// * [isAlpha] - Whether the encountered Pokémon is an alpha Pokémon.
@BuiltValue()
abstract class EncounterPokemonDetail implements Built<EncounterPokemonDetail, EncounterPokemonDetailBuilder> {
  /// The minimum number of perfect IVs, or null if unspecified.
  @BuiltValueField(wireName: r'min_perfect_ivs')
  int? get minPerfectIvs;

  /// Whether the encountered Pokémon is always shiny.
  @BuiltValueField(wireName: r'always_shiny')
  bool? get alwaysShiny;

  /// Whether the encountered Pokémon can never be shiny.
  @BuiltValueField(wireName: r'never_shiny')
  bool? get neverShiny;

  /// Whether the encountered Pokémon is an alpha Pokémon.
  @BuiltValueField(wireName: r'is_alpha')
  bool? get isAlpha;

  EncounterPokemonDetail._();

  factory EncounterPokemonDetail([void updates(EncounterPokemonDetailBuilder b)]) = _$EncounterPokemonDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(EncounterPokemonDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<EncounterPokemonDetail> get serializer => _$EncounterPokemonDetailSerializer();
}

class _$EncounterPokemonDetailSerializer implements PrimitiveSerializer<EncounterPokemonDetail> {
  @override
  final Iterable<Type> types = const [EncounterPokemonDetail, _$EncounterPokemonDetail];

  @override
  final String wireName = r'EncounterPokemonDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    EncounterPokemonDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.minPerfectIvs != null) {
      yield r'min_perfect_ivs';
      yield serializers.serialize(
        object.minPerfectIvs,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.alwaysShiny != null) {
      yield r'always_shiny';
      yield serializers.serialize(
        object.alwaysShiny,
        specifiedType: const FullType(bool),
      );
    }
    if (object.neverShiny != null) {
      yield r'never_shiny';
      yield serializers.serialize(
        object.neverShiny,
        specifiedType: const FullType(bool),
      );
    }
    if (object.isAlpha != null) {
      yield r'is_alpha';
      yield serializers.serialize(
        object.isAlpha,
        specifiedType: const FullType(bool),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    EncounterPokemonDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required EncounterPokemonDetailBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'min_perfect_ivs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.minPerfectIvs = valueDes;
          break;
        case r'always_shiny':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.alwaysShiny = valueDes;
          break;
        case r'never_shiny':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.neverShiny = valueDes;
          break;
        case r'is_alpha':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isAlpha = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  EncounterPokemonDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = EncounterPokemonDetailBuilder();
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


