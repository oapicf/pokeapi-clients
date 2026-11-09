//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_evolution_known_move.g.dart';

/// PokemonEvolutionKnownMove
///
/// Properties:
/// * [name] 
/// * [url] 
@BuiltValue()
abstract class PokemonEvolutionKnownMove implements Built<PokemonEvolutionKnownMove, PokemonEvolutionKnownMoveBuilder> {
  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'url')
  String get url;

  PokemonEvolutionKnownMove._();

  factory PokemonEvolutionKnownMove([void updates(PokemonEvolutionKnownMoveBuilder b)]) = _$PokemonEvolutionKnownMove;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonEvolutionKnownMoveBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonEvolutionKnownMove> get serializer => _$PokemonEvolutionKnownMoveSerializer();
}

class _$PokemonEvolutionKnownMoveSerializer implements PrimitiveSerializer<PokemonEvolutionKnownMove> {
  @override
  final Iterable<Type> types = const [PokemonEvolutionKnownMove, _$PokemonEvolutionKnownMove];

  @override
  final String wireName = r'PokemonEvolutionKnownMove';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonEvolutionKnownMove object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'url';
    yield serializers.serialize(
      object.url,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonEvolutionKnownMove object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonEvolutionKnownMoveBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.url = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonEvolutionKnownMove deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonEvolutionKnownMoveBuilder();
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


