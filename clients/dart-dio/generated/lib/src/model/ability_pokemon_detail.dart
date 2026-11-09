//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pokemon_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ability_pokemon_detail.g.dart';

/// AbilityPokemonDetail
///
/// Properties:
/// * [isHidden] - Whether or not this a hidden ability for the referenced Pokémon.
/// * [slot] - Pokémon have 3 ability 'slots' which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.
/// * [pokemon] - The Pokémon this ability could belong to.
@BuiltValue()
abstract class AbilityPokemonDetail implements Built<AbilityPokemonDetail, AbilityPokemonDetailBuilder> {
  /// Whether or not this a hidden ability for the referenced Pokémon.
  @BuiltValueField(wireName: r'is_hidden')
  bool? get isHidden;

  /// Pokémon have 3 ability 'slots' which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.
  @BuiltValueField(wireName: r'slot')
  int get slot;

  /// The Pokémon this ability could belong to.
  @BuiltValueField(wireName: r'pokemon')
  PokemonSummary get pokemon;

  AbilityPokemonDetail._();

  factory AbilityPokemonDetail([void updates(AbilityPokemonDetailBuilder b)]) = _$AbilityPokemonDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AbilityPokemonDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AbilityPokemonDetail> get serializer => _$AbilityPokemonDetailSerializer();
}

class _$AbilityPokemonDetailSerializer implements PrimitiveSerializer<AbilityPokemonDetail> {
  @override
  final Iterable<Type> types = const [AbilityPokemonDetail, _$AbilityPokemonDetail];

  @override
  final String wireName = r'AbilityPokemonDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AbilityPokemonDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.isHidden != null) {
      yield r'is_hidden';
      yield serializers.serialize(
        object.isHidden,
        specifiedType: const FullType(bool),
      );
    }
    yield r'slot';
    yield serializers.serialize(
      object.slot,
      specifiedType: const FullType(int),
    );
    yield r'pokemon';
    yield serializers.serialize(
      object.pokemon,
      specifiedType: const FullType(PokemonSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AbilityPokemonDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AbilityPokemonDetailBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'is_hidden':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isHidden = valueDes;
          break;
        case r'slot':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.slot = valueDes;
          break;
        case r'pokemon':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PokemonSummary),
          ) as PokemonSummary;
          result.pokemon.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AbilityPokemonDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AbilityPokemonDetailBuilder();
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


