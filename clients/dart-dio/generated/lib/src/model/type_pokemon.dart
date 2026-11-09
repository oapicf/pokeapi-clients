//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pokemon_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'type_pokemon.g.dart';

/// TypePokemon
///
/// Properties:
/// * [slot] - The order the Pokémon's types are listed in.
/// * [pokemon] - The Pokémon that has the referenced type.
@BuiltValue()
abstract class TypePokemon implements Built<TypePokemon, TypePokemonBuilder> {
  /// The order the Pokémon's types are listed in.
  @BuiltValueField(wireName: r'slot')
  int get slot;

  /// The Pokémon that has the referenced type.
  @BuiltValueField(wireName: r'pokemon')
  PokemonSummary get pokemon;

  TypePokemon._();

  factory TypePokemon([void updates(TypePokemonBuilder b)]) = _$TypePokemon;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TypePokemonBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TypePokemon> get serializer => _$TypePokemonSerializer();
}

class _$TypePokemonSerializer implements PrimitiveSerializer<TypePokemon> {
  @override
  final Iterable<Type> types = const [TypePokemon, _$TypePokemon];

  @override
  final String wireName = r'TypePokemon';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TypePokemon object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
    TypePokemon object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TypePokemonBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
  TypePokemon deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TypePokemonBuilder();
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


